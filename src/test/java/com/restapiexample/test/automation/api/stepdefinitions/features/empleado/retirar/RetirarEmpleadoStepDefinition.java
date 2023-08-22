package com.restapiexample.test.automation.api.stepdefinitions.features.empleado.retirar;

import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.questions.features.empleado.consulta.NoSeRecuperaInformacion;
import com.restapiexample.test.automation.api.stepdefinitions.general.api.SistemaStepDefinition;
import com.restapiexample.test.automation.api.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import com.restapiexample.test.automation.api.tasks.features.empleado.consultar.ConsultarEmpleado;
import com.restapiexample.test.automation.api.tasks.features.empleado.retirar.RetirarEmpleado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class RetirarEmpleadoStepDefinition
{
    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"(.*)\" ha solicitado el retiro de un empleado.*")
    public static void dadoQueHaSolicitadoElRetiroDeUnEmpleado(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        SistemaStepDefinition.dadoQueSeEncuentraAnteElSistema(actor);
        RetirarEmpleadoStepDefinition.cuandoSolicitaElRetiroDelEmpleado(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita el retiro del empleado.*")
    public static void cuandoSolicitaElRetiroDelEmpleado(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            RetirarEmpleado.delSistema(
                libreto.getRetirarEmpleadoParams()
            )
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita la consulta del empleado, retirado.*")
    public static void cuandoSolicitaLaConsultaDelEmpleadoRetirado()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConsultarEmpleado.enElSistema(
                Protagonista.enEscena().getLibreto().getRetirarEmpleadoParams()
                    .getRequest().getId()
            )
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#ENTONCES
     */
    @Entonces("^no deberia obtenerse informacion al respecto.*")
    public static void entoncesNoDeberiaObtenerseInformacionAlRespecto()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_PREGUNTAS
         */

        Protagonista.enEscena().should(
            GivenWhenThen.seeThat(
                NoSeRecuperaInformacion.delEmpleado(
                    Protagonista.enEscena().getLibreto().getConsultarEmpleadoParams()
                )
            )
        );
    }

}
