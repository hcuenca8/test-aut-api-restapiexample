package com.restapiexample.test.automation.api.stepdefinitions.features.empleado.editar;

import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.questions.features.empleado.consulta.CorrespondeAlEmpleado;
import com.restapiexample.test.automation.api.stepdefinitions.general.api.SistemaStepDefinition;
import com.restapiexample.test.automation.api.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import com.restapiexample.test.automation.api.tasks.features.empleado.consultar.ConsultarEmpleado;
import com.restapiexample.test.automation.api.tasks.features.empleado.editar.EditarEmpleado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class EditarEmpleadoStepDefinition
{
    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"(.*)\" ha solicitado editar la informacion de un empleado.*")
    public static void dadoQueHaSolicitadoEditarLaInformacionDeUnEmpleado(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        SistemaStepDefinition.dadoQueSeEncuentraAnteElSistema(actor);
        EditarEmpleadoStepDefinition.cuandoSolicitaLaEditarLaInformacionDeUnEmpleado(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita editar la informacion de un empleado.*")
    public static void cuandoSolicitaLaEditarLaInformacionDeUnEmpleado(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            EditarEmpleado.enElSistema(libreto.getEditarEmpleadoParams())
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita la consulta del empleado, recien editado.*")
    public static void cuandoSolicitaLaConsultaDelEmpleadoRecienEditado()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConsultarEmpleado.enElSistema(
                Protagonista.enEscena().getLibreto().getEditarEmpleadoParams()
                    .getRequest().getResponse().getBody().getData().getId()
            )
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#ENTONCES
     */
    @Entonces("^deberia observarse la informacion recientemente actualizada.*")
    public static void entoncesDeberiaObservarseLaInformacionRecientementeActualizada()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_PREGUNTAS
         */

        Libreto libreto = Protagonista.enEscena().getLibreto();

        Protagonista.enEscena().should(
            GivenWhenThen.seeThat(
                CorrespondeAlEmpleado.procesado(
                    libreto.getConsultarEmpleadoParams(),
                    libreto.getEditarEmpleadoParams().getRequest().getResponse()
                        .getBody().getData()
                )
            )
        );
    }

}
