package com.restapiexample.test.automation.api.runners.features.empleado.retirar;

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
    features = RunnerConstants.PACKAGE_FEATURES+"/empleado/retirar/retirar_empleado.feature",
    glue = {RunnerConstants.PACKAGE_STEP_DEFINITIONS,RunnerConstants.PACKAGE_SETUPS},
    tags = "@RetirarEmpleado",
    dryRun = false //Desactive, despues de comprobar la existencia/relacion entre enunciado gherkin y StepDefinition
)
public class TestRetirarEmpleadoRunner
{
    /**
     * Para mas informacion:
     * @see RunnersJavaDoc#CONSTRUCTOR
     */
    private TestRetirarEmpleadoRunner()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
