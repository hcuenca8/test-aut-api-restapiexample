package com.restapiexample.test.automation.api.models.dtos.requests.empleado.crear;

import com.restapiexample.test.automation.api.models.dtos.data.DataEmpleado;
import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.crear.CrearEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CrearEmpleadoRequest implements IRequest<CrearEmpleadoResponse>
{

    private DataEmpleado body;

    private GeneralResponse<CrearEmpleadoResponse> response;

    public final Class<CrearEmpleadoResponse> claseResponse = CrearEmpleadoResponse.class;

}
