package com.restapiexample.test.automation.api.models.scena;


import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.general.interfaces.IResponse;
import com.restapiexample.test.automation.api.models.params.PlantillaParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadosParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.crear.CrearEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.editar.EditarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.retirar.RetirarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.general.api.RespuestaPeticionParams;
import lombok.Data;

@Data
public class Libreto {

    private PlantillaParams parametrosPlantilla;

    private IRequest<? extends IResponse> ultimaSolicitud;

    private CrearEmpleadoParams crearEmpleadoParams;

    private ConsultarEmpleadoParams consultarEmpleadoParams;

    private ConsultarEmpleadosParams consultarEmpleadosParams;

    private EditarEmpleadoParams editarEmpleadoParams;

    private RetirarEmpleadoParams retirarEmpleadoParams;

    private RespuestaPeticionParams respuestaPeticionParams;
}

