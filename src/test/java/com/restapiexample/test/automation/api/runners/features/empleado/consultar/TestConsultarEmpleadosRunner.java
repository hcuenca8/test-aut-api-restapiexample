package com.restapiexample.test.automation.api.runners.features.empleado.consultar;

import com.restapiexample.test.automation.api.runners.RunnerConstants;
import com.restapiexample.test.automation.api.runners.javadoc.RunnersJavaDoc;
import com.restapiexample.test.automation.api.utils.GeneralUtil;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


/**
 * Para mas informacion:
 * @see RunnersJavaDoc#CLASE
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    features = RunnerConstants.PACKAGE_FEATURES+"/empleado/consultar/consultar_empleados.feature",
    glue = {RunnerConstants.PACKAGE_STEP_DEFINITIONS,RunnerConstants.PACKAGE_SETUPS},
    tags = "@ConsultarEmpleados",
    dryRun = false //Desactive, despues de comprobar la existencia/relacion entre enunciado gherkin y StepDefinition
)
public class TestConsultarEmpleadosRunner
{
    /**
     * Para mas informacion:
     * @see RunnersJavaDoc#CONSTRUCTOR
     */
    private TestConsultarEmpleadosRunner()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
