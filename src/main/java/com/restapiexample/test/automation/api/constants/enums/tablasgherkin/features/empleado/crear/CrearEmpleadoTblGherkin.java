package com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.crear;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.models.params.features.empleado.crear.CrearEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum CrearEmpleadoTblGherkin implements ITablaGherkin<CrearEmpleadoParams>
{
    NOMBRE("nombre_empleado_nuevo"),
    SALARIO("salario_empleado_nuevo"),
    EDAD("edad_empleado_nuevo"),
    ;

    private final String columna;

    CrearEmpleadoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public CrearEmpleadoParams crearScreen(TablaGherkinUtil deLaTablaGherkin)
    {
        CrearEmpleadoParams parametros = CrearEmpleadoParams.crearParams(
                deLaTablaGherkin.obtener(NOMBRE),
                deLaTablaGherkin.obtener(SALARIO),
                deLaTablaGherkin.obtener(EDAD)
        );

        Protagonista.principal().getLibreto().setCrearEmpleadoParams(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
