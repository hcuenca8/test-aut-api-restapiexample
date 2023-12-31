package com.restapiexample.test.automation.api.models.params.features.empleado.retirar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.retirar.RetirarEmpleadoRequest;
import com.restapiexample.test.automation.api.models.params.javadoc.ParamsJavaDoc;
import com.restapiexample.test.automation.api.utils.models.params.interfaces.IParam;
import lombok.Builder;
import lombok.Data;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Builder
@Data
public class RetirarEmpleadoParams implements IParam
{

    private RetirarEmpleadoRequest request;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static RetirarEmpleadoParams crearParams(String id)
    {
        return RetirarEmpleadoParams.builder()
            .request(RetirarEmpleadoRequest.builder()
                .id(id)
                .build()
            ).build();
    }
}
