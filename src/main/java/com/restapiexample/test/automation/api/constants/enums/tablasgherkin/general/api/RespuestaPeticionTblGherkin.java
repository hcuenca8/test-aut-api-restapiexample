package com.restapiexample.test.automation.api.constants.enums.tablasgherkin.general.api;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.models.params.features.empleado.retirar.RetirarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.general.api.RespuestaPeticionParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum RespuestaPeticionTblGherkin implements ITablaGherkin<RespuestaPeticionParams>
{

    CODIGO("codigo_respuesta"),
    ESTADO("estado_respuesta"),
    MENSAJE("mensaje_respuesta"),
    ;

    private final String columna;

    RespuestaPeticionTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public RespuestaPeticionParams crearScreen(TablaGherkinUtil deLaTablaGherkin)
    {
        RespuestaPeticionParams parametros = RespuestaPeticionParams.crearParams(
            deLaTablaGherkin.obtener(CODIGO),
            deLaTablaGherkin.obtener(ESTADO),
            deLaTablaGherkin.obtener(MENSAJE)
        );

        Protagonista.principal().getLibreto().setRespuestaPeticionParams(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
