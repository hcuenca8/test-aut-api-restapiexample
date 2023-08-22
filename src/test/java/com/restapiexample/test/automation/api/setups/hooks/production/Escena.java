package com.restapiexample.test.automation.api.setups.hooks.production;

import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Escena {

    @Before
    public void camaras() {
        OnStage.setTheStage(new OnlineCast());

        /**
         * habilitar trazado (logs) al momento de consumir un servicio (request/response)
         */
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    /**
     * Al terminar un caso de prueba
     */
    @After
    public void corte(Scenario escenario)
    {
        Protagonista.sePreparaParaSiguienteEscena();
    }
}
