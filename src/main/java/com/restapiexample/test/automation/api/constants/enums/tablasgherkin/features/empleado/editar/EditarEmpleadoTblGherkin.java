package com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.editar;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.models.params.features.empleado.editar.EditarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum EditarEmpleadoTblGherkin implements ITablaGherkin<EditarEmpleadoParams>
{
    ID("id_empleado_edita"),
    NOMBRE("nombre_empleado_edita"),
    SALARIO("salario_empleado_edita"),
    EDAD("edad_empleado_edita"),
    ;

    private final String columna;

    EditarEmpleadoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public EditarEmpleadoParams crearScreen(TablaGherkinUtil deLaTablaGherkin)
    {
        EditarEmpleadoParams parametros = EditarEmpleadoParams.crearParams(
                deLaTablaGherkin.obtener(ID),
                deLaTablaGherkin.obtener(NOMBRE),
                deLaTablaGherkin.obtener(SALARIO),
                deLaTablaGherkin.obtener(EDAD)
        );

        Protagonista.principal().getLibreto().setEditarEmpleadoParams(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
