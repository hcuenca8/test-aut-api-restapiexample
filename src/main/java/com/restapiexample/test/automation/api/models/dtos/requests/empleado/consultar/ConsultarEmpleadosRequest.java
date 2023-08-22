package com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar;

import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadosResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ConsultarEmpleadosRequest implements IRequest<ConsultarEmpleadosResponse>
{

    private GeneralResponse<ConsultarEmpleadosResponse> response;

    public final Class<ConsultarEmpleadosResponse> claseResponse = ConsultarEmpleadosResponse.class;
}
