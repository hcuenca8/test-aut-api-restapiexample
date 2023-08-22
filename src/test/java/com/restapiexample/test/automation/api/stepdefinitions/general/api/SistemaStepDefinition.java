package com.restapiexample.test.automation.api.stepdefinitions.general.api;

import com.restapiexample.test.automation.api.constants.enums.configuracion.serenity.SerenityConf;
import com.restapiexample.test.automation.api.interactions.Depurar;
import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.questions.PlantillaQuestion;
import com.restapiexample.test.automation.api.questions.general.api.RespuestaAdecuada;
import com.restapiexample.test.automation.api.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import com.restapiexample.test.automation.api.tasks.PlantillaTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class SistemaStepDefinition
{
    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"(.*)\" se encuentra ante el sistema.*")
    public static void dadoQueSeEncuentraAnteElSistema(String actor)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        Protagonista.haActuadoPreviamente(actor);
        Protagonista.entraEnEscena(actor)
            .whoCan(CallAnApi.at(SerenityConf.URL_BASE.getValor()))
            .attemptsTo(
                Depurar.enConsola("Inicio del Test")
            );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#ENTONCES
     */
    @Entonces("^deberia recibirse la respuesta adecuada a la solicitud.*")
    public static void entoncesDeberiaRecibirseLaRespuestaAdecuadaALaSolicitud(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_PREGUNTAS
         */
        Protagonista.enEscena().should(
            GivenWhenThen.seeThat(
                RespuestaAdecuada.delSistema(libreto.getRespuestaPeticionParams())
            )
        );
    }
}
