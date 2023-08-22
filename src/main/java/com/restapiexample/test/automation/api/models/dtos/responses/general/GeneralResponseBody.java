package com.restapiexample.test.automation.api.models.dtos.responses.general;

import com.google.gson.annotations.SerializedName;
import com.restapiexample.test.automation.api.models.dtos.responses.general.interfaces.IResponse;
import com.restapiexample.test.automation.api.models.params.javadoc.ParamsJavaDoc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralResponseBody implements IResponse
{
    @SerializedName("status")
    private String estado;

    @SerializedName("message")
    private String mensaje;

}
