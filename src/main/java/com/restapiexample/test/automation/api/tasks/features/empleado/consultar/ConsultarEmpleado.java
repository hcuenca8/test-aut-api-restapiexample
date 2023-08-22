package com.restapiexample.test.automation.api.tasks.features.empleado.consultar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar.ConsultarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.requests.empleado.crear.CrearEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.crear.CrearEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import com.restapiexample.test.automation.api.utils.json.JSONUtils;
import com.restapiexample.test.automation.api.utils.service.request.PeticionUtil;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class ConsultarEmpleado extends SolicitarOperacion<ConsultarEmpleadoResponse, ConsultarEmpleadoRequest>
{
    private ConsultarEmpleadoParams parametros;

    private final String PATH = "/v1/employee";

    @Override
    protected ConsultarEmpleadoRequest getRequest() {
        return this.parametros.getRequest();
    }

    @Override
    protected <T extends Actor> void execute(T actor) {
        actor.attemptsTo(
            Get.resource(PATH+"/"+this.parametros.getRequest().getId())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#PERFORM_AS
     */
//    @Override
//    public <T extends Actor> void performAs(T actor)
//    {
//        /**
//         * Para mas informacion:
//         * @see TasksJavaDoc#ENLAZAR_ACCIONES
//         */
//
//        do{
//            actor.attemptsTo(
//                Get.resource(PATH+"/"+this.parametros.getRequest().getId())
//            );
//
//        }while(PeticionUtil.esperaXReintento(actor)); //Too Many Requests
//
//        this.parametros.getRequest().setResponse(
//            GeneralResponse.<ConsultarEmpleadoResponse>builder()
//                .body(JSONUtils.pasarAObjeto(
//                        SerenityRest.lastResponse().getBody().prettyPrint(),
//                        ConsultarEmpleadoResponse.class
//                    )
//                ).codigo(SerenityRest.lastResponse().statusCode())
//                .build()
//        );
//    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static ConsultarEmpleado enElSistema(String id)
    {
        ConsultarEmpleadoParams parametros = ConsultarEmpleadoParams.crearParams(id);

        Protagonista.enEscena().getLibreto()
            .setConsultarEmpleadoParams(
                parametros
            );

        return ConsultarEmpleado.enElSistema(parametros);
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static ConsultarEmpleado enElSistema(ConsultarEmpleadoParams parametros)
    {
        return Tasks.instrumented(
            ConsultarEmpleado.class,
            parametros
        );
    }


}
