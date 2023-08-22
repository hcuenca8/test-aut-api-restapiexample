package com.restapiexample.test.automation.api.runners;

public class RunnerConstants {

    private RunnerConstants(){
        throw new UnsupportedOperationException();
    }

    private final static String BASE = "com.restapiexample.test.automation.api";
    private final static String URL = "src/test/resources/com/restapiexample/test/automation/api";

    public final static String PACKAGE_STEP_DEFINITIONS = BASE+".stepdefinitions";
    public final static String PACKAGE_DATA_DEFINITIONS = BASE+".datadefinitions";
    public final static String PACKAGE_SETUPS = BASE+".setups";
    public final static String PACKAGE_FEATURES = URL+"/features";

}
