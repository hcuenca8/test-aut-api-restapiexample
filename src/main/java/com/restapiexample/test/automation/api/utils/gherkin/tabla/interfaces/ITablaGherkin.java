package com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces;

import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;

public interface ITablaGherkin<T> {


    String getColumna();
    T crearScreen(TablaGherkinUtil deLaTablaGherkin);

}
