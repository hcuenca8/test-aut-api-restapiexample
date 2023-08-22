package com.restapiexample.test.automation.api.tasks.features.empleado.consultar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar.ConsultarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar.ConsultarEmpleadosRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadosResponse;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadosParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.tasks.general.SolicitarOperacion;
import com.restapiexample.test.automation.api.tasks.javadoc.TasksJavaDoc;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
@NoArgsConstructor
public class ConsultarEmpleados extends SolicitarOperacion<ConsultarEmpleadosResponse, ConsultarEmpleadosRequest>
{
    private ConsultarEmpleadosParams parametros;

    private final String PATH = "/v1/employees";

    @Override
    protected ConsultarEmpleadosRequest getRequest()
    {
        if(this.parametros == null)
        {
            this.parametros = ConsultarEmpleadosParams.crearParams();
            Protagonista.enEscena().getLibreto().setConsultarEmpleadosParams(this.parametros);
        }

        return this.parametros.getRequest();
    }

    @Override
    protected <T extends Actor> void execute(T actor) {
        actor.attemptsTo(
            Get.resource(PATH)
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static ConsultarEmpleados enElSistema()
    {
        return Tasks.instrumented(
            ConsultarEmpleados.class
        );
    }


}
