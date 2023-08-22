package com.restapiexample.test.automation.api.models.params.features.empleado.consultar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar.ConsultarEmpleadoRequest;
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
public class ConsultarEmpleadoParams implements IParam
{

    private ConsultarEmpleadoRequest request;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static ConsultarEmpleadoParams crearParams(String id)
    {
        return ConsultarEmpleadoParams.builder()
            .request(ConsultarEmpleadoRequest.builder()
                .id(id)
                .build()
            ).build();
    }
}
