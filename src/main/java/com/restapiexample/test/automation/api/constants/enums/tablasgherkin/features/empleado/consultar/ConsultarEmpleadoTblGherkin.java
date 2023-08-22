package com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.consultar;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum ConsultarEmpleadoTblGherkin implements ITablaGherkin<ConsultarEmpleadoParams>
{
    ID("id_empleado_consulta"),
    ;

    private final String columna;

    ConsultarEmpleadoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public ConsultarEmpleadoParams crearScreen(TablaGherkinUtil deLaTablaGherkin)
    {
        ConsultarEmpleadoParams parametros = ConsultarEmpleadoParams.crearParams(
                deLaTablaGherkin.obtener(ID)
        );

        Protagonista.principal().getLibreto().setConsultarEmpleadoParams(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
