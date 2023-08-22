package com.restapiexample.test.automation.api.stepdefinitions.features.empleado.crear;

import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.questions.features.empleado.consulta.CorrespondeAlEmpleado;
import com.restapiexample.test.automation.api.stepdefinitions.general.api.SistemaStepDefinition;
import com.restapiexample.test.automation.api.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import com.restapiexample.test.automation.api.tasks.features.empleado.consultar.ConsultarEmpleado;
import com.restapiexample.test.automation.api.tasks.features.empleado.crear.CrearEmpleado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class CrearEmpleadoStepDefinition
{
    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"(.*)\" ha solicitado crear un empleado.*")
    public static void dadoQueHaSolicitadoCrearUnEmpleado(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        SistemaStepDefinition.dadoQueSeEncuentraAnteElSistema(actor);
        CrearEmpleadoStepDefinition.cuandoSolicitaCrearUnEmpleado(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita crear un empleado.*")
    public static void cuandoSolicitaCrearUnEmpleado(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            CrearEmpleado.enElSistema(libreto.getCrearEmpleadoParams())
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^solicita la consulta del nuevo empleado.*")
    public static void cuandoSolicitaLaConsultaDelNuevoEmpleado()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConsultarEmpleado.enElSistema(
                Protagonista.enEscena().getLibreto().getCrearEmpleadoParams()
                    .getRequest().getResponse().getBody().getData().getId()
            )
        );

    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#ENTONCES
     */
    @Entonces("^deberia observarse la informacion con la que fue creado.*")
    public static void entoncesDeberiaObservarseLaInformacionConLaQueFueCreado()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_PREGUNTAS
         */

        Libreto libreto = Protagonista.enEscena().getLibreto();

        Protagonista.enEscena().should(
            GivenWhenThen.seeThat(
                CorrespondeAlEmpleado.procesado(
                    libreto.getConsultarEmpleadoParams(),
                    libreto.getCrearEmpleadoParams().getRequest().getResponse()
                    .getBody().getData()
                )
            )
        );
    }

}
