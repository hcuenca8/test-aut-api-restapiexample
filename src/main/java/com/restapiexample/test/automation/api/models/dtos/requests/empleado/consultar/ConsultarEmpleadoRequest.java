package com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar;

import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.consultar.ConsultarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ConsultarEmpleadoRequest implements IRequest<ConsultarEmpleadoResponse>
{

    private String id;

    private GeneralResponse<ConsultarEmpleadoResponse> response;

    public final Class<ConsultarEmpleadoResponse> claseResponse = ConsultarEmpleadoResponse.class;

}
