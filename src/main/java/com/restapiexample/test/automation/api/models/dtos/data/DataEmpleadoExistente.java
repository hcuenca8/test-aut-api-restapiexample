package com.restapiexample.test.automation.api.models.dtos.data;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class DataEmpleadoExistente extends DataEmpleado
{
    @SerializedName("id")
    private String id;

    @SerializedName("profile_image")
    private String imagenPerfil;

}
