package com.restapiexample.test.automation.api.constants.enums.tablasgherkin;


import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.consultar.ConsultarEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.crear.CrearEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.editar.EditarEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.retiro.RetirarEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.general.api.RespuestaPeticionTblGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;
import com.restapiexample.test.automation.api.utils.models.params.interfaces.IParam;

public enum TablasGherkin
{
    CREAR_EMPLEADO(CrearEmpleadoTblGherkin.values()),
    CONSULTAR_EMPLEADO(ConsultarEmpleadoTblGherkin.values()),
    EDITAR_EMPLEADO(EditarEmpleadoTblGherkin.values()),
    RETIRAR_EMPLEADO(RetirarEmpleadoTblGherkin.values()),
    RESPUESTA_PETICION(RespuestaPeticionTblGherkin.values()),
    ;

    private final ITablaGherkin<? extends IParam>[] tablaGherkin;

    TablasGherkin(ITablaGherkin<? extends IParam>[] tablaGherkin)
    {
        this.tablaGherkin = tablaGherkin;
    }

    public ITablaGherkin<? extends IParam>[] getTablaGherkin() {
        return tablaGherkin;
    }
}
