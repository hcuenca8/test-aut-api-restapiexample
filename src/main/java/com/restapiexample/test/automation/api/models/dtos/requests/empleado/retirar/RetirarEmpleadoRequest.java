package com.restapiexample.test.automation.api.models.dtos.requests.empleado.retirar;

import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.retirar.RetirarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RetirarEmpleadoRequest implements IRequest<RetirarEmpleadoResponse>
{
    private String id;

    private GeneralResponse<RetirarEmpleadoResponse> response;

    public final Class<RetirarEmpleadoResponse> claseResponse = RetirarEmpleadoResponse.class;

}
