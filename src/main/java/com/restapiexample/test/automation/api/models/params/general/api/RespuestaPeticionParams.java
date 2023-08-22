package com.restapiexample.test.automation.api.models.params.general.api;

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
public class RespuestaPeticionParams implements IParam
{

    private int codigo;

    private String estado;

    private String mensaje;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static RespuestaPeticionParams crearParams(String codigo, String estado, String mensaje)
    {
        return RespuestaPeticionParams.builder()
                .codigo(Integer.parseInt(codigo))
                .estado(estado)
                .mensaje(mensaje)
                .build();
    }
}
