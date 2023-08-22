package com.restapiexample.test.automation.api.models.params.features.empleado.consultar;

import com.restapiexample.test.automation.api.models.dtos.requests.empleado.consultar.ConsultarEmpleadosRequest;
import com.restapiexample.test.automation.api.models.params.javadoc.ParamsJavaDoc;
import lombok.Builder;
import lombok.Data;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Builder
@Data
public class ConsultarEmpleadosParams
{

    private ConsultarEmpleadosRequest request;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static ConsultarEmpleadosParams crearParams()
    {
        return ConsultarEmpleadosParams.builder()
            .request(ConsultarEmpleadosRequest.builder()
                .build()
            ).build();
    }
}
