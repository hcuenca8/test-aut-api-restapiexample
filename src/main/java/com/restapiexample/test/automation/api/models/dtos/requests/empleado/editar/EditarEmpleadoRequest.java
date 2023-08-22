package com.restapiexample.test.automation.api.models.dtos.requests.empleado.editar;

import com.restapiexample.test.automation.api.models.dtos.data.DataEmpleado;
import com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces.IRequest;
import com.restapiexample.test.automation.api.models.dtos.responses.empleado.editar.EditarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EditarEmpleadoRequest implements IRequest<EditarEmpleadoResponse>
{
    private String id;

    private DataEmpleado body;

    private GeneralResponse<EditarEmpleadoResponse> response;

    public final Class<EditarEmpleadoResponse> claseResponse = EditarEmpleadoResponse.class;

}
