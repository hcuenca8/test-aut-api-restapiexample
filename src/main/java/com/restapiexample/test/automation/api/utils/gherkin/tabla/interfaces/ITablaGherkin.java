package com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;
import com.restapiexample.test.automation.api.utils.models.params.interfaces.IParam;

public interface ITablaGherkin<T extends IParam> {


    String getColumna();

    /**
     * Para mas informacion:
     * @see TblGherkinJavaDoc#CREAR_PARAMS
     */
    T crearScreen(TablaGherkinUtil deLaTablaGherkin);

}
