package com.restapiexample.test.automation.api.models.params.features.empleado.crear;

import com.restapiexample.test.automation.api.models.dtos.data.DataEmpleado;
import com.restapiexample.test.automation.api.models.dtos.requests.empleado.crear.CrearEmpleadoRequest;
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
public class CrearEmpleadoParams implements IParam
{

    private CrearEmpleadoRequest request;


    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static CrearEmpleadoParams crearParams(String nombre, String salario, String edad)
    {
        return CrearEmpleadoParams.builder()
                .request(CrearEmpleadoRequest.builder()
                    .body(DataEmpleado.builder(
                            nombre,
                            salario,
                            edad
                        )
                    ).build())
                .build();
    }
}
