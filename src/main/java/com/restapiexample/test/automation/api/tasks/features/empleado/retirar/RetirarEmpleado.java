package com.restapiexample.test.automation.api.tasks.features.empleado.retirar;

import com.restapiexample.test.automation.api.constants.enums.configuracion.serenity.SerenityConf;
import com.restapiexample.test.automation.api.models.dtos.requests.empleado.retirar.RetirarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.retirar.RetirarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.retirar.RetirarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
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

    //"/v1/delete"
    private static final String PATH = SerenityConf.PATH_DEL_DELETE.getValor();

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
