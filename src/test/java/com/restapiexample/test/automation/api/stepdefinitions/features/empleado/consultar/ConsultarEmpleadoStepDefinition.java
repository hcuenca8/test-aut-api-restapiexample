package com.restapiexample.test.automation.api.stepdefinitions.features.empleado.consultar;

import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.stepdefinitions.general.api.SistemaStepDefinition;
import com.restapiexample.test.automation.api.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import com.restapiexample.test.automation.api.tasks.features.empleado.consultar.ConsultarEmpleado;
import com.restapiexample.test.automation.api.tasks.features.empleado.consultar.ConsultarEmpleados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class ConsultarEmpleadoStepDefinition
{
    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"(.*)\" ha solicitado consultar un empleado.*")
    public static void dadoQueHaSolicitadoConsultarUnEmpleado(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        SistemaStepDefinition.dadoQueSeEncuentraAnteElSistema(actor);
        ConsultarEmpleadoStepDefinition.cuandoSolicitaLaConsultaDeUnEmpleado(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita la consulta de un empleado.*")
    public static void cuandoSolicitaLaConsultaDeUnEmpleado(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConsultarEmpleado.enElSistema(libreto.getConsultarEmpleadoParams())
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita la consulta de todos los empleados.*")
    public static void cuandoSolicitaLaConsultaDeTodosLosEmpleados()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConsultarEmpleados.enElSistema()
        );
    }

}
