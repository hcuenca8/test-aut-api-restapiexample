package com.restapiexample.test.automation.api.setups.datadefinitions;

import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class LibretoDataDefinition {

    @DataTableType
    public Libreto libreto(Map<String, String> tblGherkin)
    {
        Protagonista.principal().ensayarLibreto(tblGherkin);
        return Protagonista.principal().getLibreto();
    }

}
