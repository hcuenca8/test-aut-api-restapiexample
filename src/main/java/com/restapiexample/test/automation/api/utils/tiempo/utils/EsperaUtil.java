package com.restapiexample.test.automation.api.utils.tiempo.utils;

import com.restapiexample.test.automation.api.utils.GeneralUtil;
import com.restapiexample.test.automation.api.utils.javadoc.JavaDocUtil;
import com.restapiexample.test.automation.api.utils.tiempo.constants.enums.UnidadTiempo;

/**
 * {{Plantilla para la creacion de clases utilitarias}}
 */
public class EsperaUtil
{

    /**
     * Para mas informacion:
     * @see JavaDocUtil#CONSTRUCTOR
     */
    private EsperaUtil(){
        GeneralUtil.noPermitaInstanciar();
    }

    public static void detenerPor(long tiempo, UnidadTiempo unidad){

        tiempo = tiempo * unidad.getEscalaMilisegundos();

        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
