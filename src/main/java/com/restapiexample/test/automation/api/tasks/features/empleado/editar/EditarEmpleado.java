package com.restapiexample.test.automation.api.tasks.features.empleado.editar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.editar.EditarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.editar.EditarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.editar.EditarEmpleadoParams;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import com.restapiexample.test.automation.api.utils.json.JSONUtils;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class EditarEmpleado extends SolicitarOperacion<EditarEmpleadoResponse, EditarEmpleadoRequest>
{
    private EditarEmpleadoParams parametros;

    private final String PATH = "/v1/update";

    @Override
    protected EditarEmpleadoRequest getRequest() {
        return this.parametros.getRequest();
    }

    @Override
    protected <T extends Actor> void execute(T actor)
    {
        actor.attemptsTo(
            Put.to(PATH+"/"+this.parametros.getRequest().getId()).with(
                req  ->
                    //req.header("Content-Type", "application/json")
                    req.body(JSONUtils.pasarAJson(this.parametros.getRequest().getBody()))
            )
        );
    }

    @Override
    protected <T extends Actor> void finish(T actor) {
        this.parametros.getRequest().getResponse().getBody().getData()
            .setId(this.parametros.getRequest().getId());
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static EditarEmpleado enElSistema(EditarEmpleadoParams parametros)
    {
       return Tasks.instrumented(
           EditarEmpleado.class,
           parametros
       );
    }
}
