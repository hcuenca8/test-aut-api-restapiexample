package com.restapiexample.test.automation.api.constants.enums.tablasgherkin;


import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.consultar.ConsultarEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.crear.CrearEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.editar.EditarEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.features.empleado.retiro.RetirarEmpleadoTblGherkin;
import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.general.api.RespuestaPeticionTblGherkin;
import com.restapiexample.test.automation.api.utils.gherkin.tabla.interfaces.ITablaGherkin;

public enum TablasGherkin
{
    CREAR_EMPLEADO(CrearEmpleadoTblGherkin.values()),
    CONSULTAR_EMPLEADO(ConsultarEmpleadoTblGherkin.values()),
    EDITAR_EMPLEADO(EditarEmpleadoTblGherkin.values()),
    RETIRAR_EMPLEADO(RetirarEmpleadoTblGherkin.values()),
    RESPUESTA_PETICION(RespuestaPeticionTblGherkin.values()),
    ;

    private final ITablaGherkin<?>[] tablaGherkin;

    TablasGherkin(ITablaGherkin<?>[] tablaGherkin)
    {
        this.tablaGherkin = tablaGherkin;
    }

    public ITablaGherkin<?>[] getTablaGherkin() {
        return tablaGherkin;
    }
}
