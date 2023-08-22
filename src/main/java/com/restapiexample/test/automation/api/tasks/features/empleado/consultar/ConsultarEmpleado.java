package com.restapiexample.test.automation.api.tasks.features.empleado.consultar;

import com.restapiexample.test.automation.api.constants.enums.configuracion.serenity.SerenityConf;
import com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar.ConsultarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
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

    //"/v1/employee"
    private static final String PATH = SerenityConf.PATH_GET_EMPLOYEE.getValor();

    @Override
    protected ConsultarEmpleadoRequest getRequest() {
        return this.parametros.getRequest();
    }

    @Override
    protected <T extends Actor> void execute(T actor) {
        actor.attemptsTo(
            Get.resource(PATH +"/"+this.parametros.getRequest().getId())
        );
    }

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
