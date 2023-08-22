package com.restapiexample.test.automation.api.runners.general;


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
        features = RunnerConstants.PACKAGE_FEATURES,
        glue = {RunnerConstants.PACKAGE_STEP_DEFINITIONS,RunnerConstants.PACKAGE_DATA_DEFINITIONS,RunnerConstants.PACKAGE_SETUPS},
        tags = "@HP",
        dryRun = false
)
public class TestHPRunner
{
    /**
     * Para mas informacion:
     * @see RunnersJavaDoc#CONSTRUCTOR
     */
    private TestHPRunner()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
