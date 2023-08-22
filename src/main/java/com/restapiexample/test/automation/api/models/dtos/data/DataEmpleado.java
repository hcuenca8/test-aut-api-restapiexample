package com.restapiexample.test.automation.api.models.dtos.data;

import com.google.gson.annotations.SerializedName;
import com.restapiexample.test.automation.api.models.params.javadoc.ParamsJavaDoc;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class DataEmpleado
{
    //@SerializedName("name")
    @SerializedName("employee_name")
    private String nombre;

    //@SerializedName("salary")
    @SerializedName("employee_salary")
    private String salario;

    //@SerializedName("age")
    @SerializedName("employee_age")
    private String edad;

    public static DataEmpleado builder(String nombre,String salario,String edad){
        DataEmpleado dataEmpleado = new DataEmpleado();
        dataEmpleado.setNombre(nombre);
        dataEmpleado.setSalario(salario);
        dataEmpleado.setEdad(edad);
        return dataEmpleado;
    }

}
