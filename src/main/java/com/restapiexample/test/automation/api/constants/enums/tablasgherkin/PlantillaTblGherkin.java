package com.restapiexample.test.automation.api.constants.enums.tablasgherkin;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.models.params.PlantillaParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum PlantillaTblGherkin implements ITablaGherkin<PlantillaParams>
{
    PARAMETRO1("{{parametro1_tabla_gherkin_feature}}"),
    PARAMETRO2("{{parametro2_tabla_gherkin_feature}}"),
    PARAMETRO3("{{parametro3_tabla_gherkin_feature}}"),
    ;

    private final String columna;

    PlantillaTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public PlantillaParams crearScreen(TablaGherkinUtil deLaTablaGherkin)
    {
        PlantillaParams parametros = PlantillaParams.crearParams(
                deLaTablaGherkin.obtener(PARAMETRO1),
                deLaTablaGherkin.obtener(PARAMETRO2),
                deLaTablaGherkin.obtener(PARAMETRO3)
        );

        Protagonista.principal().getLibreto().setParametrosPlantilla(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
