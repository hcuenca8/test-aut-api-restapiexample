package com.restapiexample.test.automation.api.models.dtos.requests.general.interfaces;

import com.restapiexample.test.automation.api.models.dtos.responses.empleado.retirar.RetirarEmpleadoResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponse;
import com.restapiexample.test.automation.api.models.dtos.responses.general.interfaces.IResponse;

public interface IRequest<T extends IResponse> {

    Class<T> getClaseResponse();

    GeneralResponse<T> getResponse();

    void setResponse(GeneralResponse<T> response);
}
