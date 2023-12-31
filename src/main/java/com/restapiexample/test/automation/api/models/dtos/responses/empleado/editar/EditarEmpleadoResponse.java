package com.restapiexample.test.automation.api.models.dtos.responses.empleado.editar;

import com.google.gson.annotations.SerializedName;
import com.restapiexample.test.automation.api.models.dtos.data.DataEmpleadoExistente;
import com.restapiexample.test.automation.api.models.dtos.responses.general.GeneralResponseBody;
import com.restapiexample.test.automation.api.models.params.javadoc.ParamsJavaDoc;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EditarEmpleadoResponse extends GeneralResponseBody
{

    @SerializedName("data")
    private DataEmpleadoExistente data;

}
