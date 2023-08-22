package com.restapiexample.test.automation.api.tasks.features.empleado.retirar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.retirar.RetirarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.crear.CrearEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.retirar.RetirarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.retirar.RetirarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.tasks.features.empleado.consultar.ConsultarEmpleado;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import com.restapiexample.test.automation.api.utils.json.JSONUtils;
import com.restapiexample.test.automation.api.utils.service.request.PeticionUtil;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class RetirarEmpleado extends SolicitarOperacion<RetirarEmpleadoResponse, RetirarEmpleadoRequest>
{
    private RetirarEmpleadoParams parametros;

    private final String PATH = "/v1/delete";

    @Override
    protected RetirarEmpleadoRequest getRequest() {
        return this.parametros.getRequest();
    }

    @Override
    protected <T extends Actor> void execute(T actor) {
        actor.attemptsTo(
            Delete.from(PATH+"/"+this.parametros.getRequest().getId())
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
//                Delete.from(PATH+"/"+this.parametros.getRequest().getId())
//            );
//
//        }while(PeticionUtil.esperaXReintento(actor)); //Too Many Requests
//
//        this.parametros.getRequest().setResponse(
//            GeneralResponse.<RetirarEmpleadoResponse>builder()
//                .body(JSONUtils.pasarAObjeto(
//                        SerenityRest.lastResponse().getBody().prettyPrint(),
//                        RetirarEmpleadoResponse.class
//                    )
//                ).codigo(SerenityRest.lastResponse().statusCode())
//                .build()
//        );
//    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static RetirarEmpleado delSistema(String id)
    {
        RetirarEmpleadoParams parametros = RetirarEmpleadoParams.crearParams(id);

        Protagonista.enEscena().getLibreto()
            .setRetirarEmpleadoParams(
                parametros
            );

        return RetirarEmpleado.delSistema(parametros);
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static RetirarEmpleado delSistema(RetirarEmpleadoParams parametros)
    {
        return Tasks.instrumented(
            RetirarEmpleado.class,
            parametros
        );
    }
}
