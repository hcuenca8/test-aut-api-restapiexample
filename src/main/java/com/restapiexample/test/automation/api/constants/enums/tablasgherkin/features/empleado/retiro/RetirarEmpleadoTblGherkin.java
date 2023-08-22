package com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.retiro;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.models.params.features.empleado.retirar.RetirarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum RetirarEmpleadoTblGherkin implements ITablaGherkin<RetirarEmpleadoParams>
{
    ID("id_empleado_retiro"),
    ;

    private final String columna;

    RetirarEmpleadoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public RetirarEmpleadoParams crearScreen(TablaGherkinUtil deLaTablaGherkin)
    {
        RetirarEmpleadoParams parametros = RetirarEmpleadoParams.crearParams(
            deLaTablaGherkin.obtener(ID)
        );

        Protagonista.principal().getLibreto().setRetirarEmpleadoParams(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
