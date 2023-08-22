package com.restapiexample.test.automation.api.utils.service.request;

import com.restapiexample.test.automation.api.interactions.Detener;
import com.restapiexample.test.automation.api.utils.GeneralUtil;
import com.restapiexample.test.automation.api.utils.javadoc.JavaDocUtil;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;

/**
 * {{Plantilla para la creacion de clases utilitarias}}
 */
public class PeticionUtil
{
    private static final int COD_STATUS_TOO_MANY_REQUEST = 429;
    private static final String HEADER_TIME_TO_RETRY = "retry-after";

    /**
     * Para mas informacion:
     * @see JavaDocUtil#CONSTRUCTOR
     */
    private PeticionUtil(){
        GeneralUtil.noPermitaInstanciar();
    }

    public static <T extends Actor> boolean esperaXReintento(T actor)
    {
        if(SerenityRest.lastResponse().statusCode()==PeticionUtil.COD_STATUS_TOO_MANY_REQUEST)
        {
            //429: Too Many Requests

            int esperaXReintento = Integer.parseInt(
                SerenityRest.lastResponse().getHeader(PeticionUtil.HEADER_TIME_TO_RETRY)
            );

            actor.attemptsTo(Detener.por(esperaXReintento).segundos());
            return true;
        }else{
            return false;
        }
    }
}
