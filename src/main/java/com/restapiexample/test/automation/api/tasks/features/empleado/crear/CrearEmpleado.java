package com.restapiexample.test.automation.api.tasks.features.empleado.crear;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.crear.CrearEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.crear.CrearEmpleadoResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.crear.CrearEmpleadoParams;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import com.restapiexample.test.automation.api.utils.json.JSONUtils;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class CrearEmpleado extends SolicitarOperacion<CrearEmpleadoResponse, CrearEmpleadoRequest>
{
    private CrearEmpleadoParams parametros;

    private final String PATH = "/v1/create";

    @Override
    protected CrearEmpleadoRequest getRequest() {
        return this.parametros.getRequest();
    }

    @Override
    protected <T extends Actor> void execute(T actor) {
        actor.attemptsTo(
            Post.to(PATH).with(
                req  ->
                    //req.header("Content-Type", "application/json")
                    req.body(JSONUtils.pasarAJson(this.parametros.getRequest().getBody()))
            )
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static CrearEmpleado enElSistema(CrearEmpleadoParams parametros)
    {
       return Tasks.instrumented(
           CrearEmpleado.class,
           parametros
       );
    }
}
