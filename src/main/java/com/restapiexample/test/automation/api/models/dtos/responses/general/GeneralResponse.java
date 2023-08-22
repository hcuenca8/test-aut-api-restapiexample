package com.restapiexample.test.automation.api.models.dtos.responses.general;

import com.restapiexample.test.automation.api.models.dtos.responses.general.interfaces.IResponse;
import com.restapiexample.test.automation.api.models.params.javadoc.ParamsJavaDoc;
import lombok.Builder;
import lombok.Data;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Data
@Builder
//@EqualsAndHashCode(callSuper = true)
public class GeneralResponse<T extends IResponse> //extends GeneralResponseStatus
{

    private T body;

    private int codigo;

}
