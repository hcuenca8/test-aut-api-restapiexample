package com.restapiexample.test.automation.api.models.params.features.empleado.editar;

import com.restapiexample.test.automation.api.models.dtos.data.DataEmpleado;
import com.restapiexample.test.automation.api.models.dtos.requests.empleado.editar.EditarEmpleadoRequest;
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
public class EditarEmpleadoParams implements IParam
{

    private EditarEmpleadoRequest request;


    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static EditarEmpleadoParams crearParams(String id,String nombre, String salario, String edad)
    {
        return EditarEmpleadoParams.builder()
                .request(EditarEmpleadoRequest.builder()
                    .id(id)
                    .body(DataEmpleado.builder(
                            nombre,
                            salario,
                            edad
                        )
                    ).build())
                .build();
    }
}
