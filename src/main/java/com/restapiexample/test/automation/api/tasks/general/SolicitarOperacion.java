package com.restapiexample.test.automation.api.tasks.general;

import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.interfaces.IResponse;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import com.restapiexample.test.automation.api.utils.json.JSONUtils;
import com.restapiexample.test.automation.api.utils.service.request.PeticionUtil;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public abstract class SolicitarOperacion<V extends IResponse,K extends IRequest<V>> implements Task
{

    protected abstract K getRequest();

    protected abstract <T extends Actor> void execute(T actor);

    protected <T extends Actor> void finish(T actor){
        return;
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#PERFORM_AS
     */
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        /**
         * Para mas informacion:
         * @see TasksJavaDoc#ENLAZAR_ACCIONES
         */

        do{
            this.execute(actor);

        }while(PeticionUtil.esperaXReintento(actor)); //Too Many Requests

        this.getRequest().setResponse(
            GeneralResponse.<V>builder()
                .body(JSONUtils.pasarAObjeto(
                        SerenityRest.lastResponse().getBody().prettyPrint(),
                        this.getRequest().getClaseResponse()
                    )
                ).codigo(SerenityRest.lastResponse().statusCode())
                .build()
        );

        Protagonista.enEscena().getLibreto().setUltimaSolicitud(this.getRequest());

        this.finish(actor);
    }
}
