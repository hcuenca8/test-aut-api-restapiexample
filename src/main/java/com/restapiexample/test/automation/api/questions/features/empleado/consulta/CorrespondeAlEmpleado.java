package com.restapiexample.test.automation.api.questions.features.empleado.consulta;

import com.restapiexample.test.automation.api.models.dtos.data.DataEmpleadoExistente;
import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.models.params.features.empleado.crear.CrearEmpleadoParams;
import com.restapiexample.test.automation.api.questions.javadoc.QuestionsJavaDoc;
import lombok.Builder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;

/**
 * Para mas informacion:
 * @see QuestionsJavaDoc#CLASE
 */
@Builder
public class CorrespondeAlEmpleado implements Question<Boolean>
{
    private ConsultarEmpleadoParams parametrosConsulta;

    private DataEmpleadoExistente dataEsperada;

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ANSWERED_BY
     */
    @Override
    public Boolean answeredBy(Actor actor)
    {
        /**
         * Para mas informacion:
         * @see QuestionsJavaDoc#ENLAZAR_VALIDACIONES_VERIFICACIONES
         */

        DataEmpleadoExistente dataConsulta = this.parametrosConsulta.getRequest().getResponse().getBody().getData();

//        dataConsulta = DataConsultaEmpleado.builder()
//            .id(dataEmpleado.getId())
//            .edad(dataEmpleado.getEdad())
//            .nombre(dataEmpleado.getNombre())
//            .salario(dataEmpleado.getSalario())
//            .build();

        return new ReflectionToStringBuilder(
                    this.dataEsperada==null? StringUtils.EMPTY:this.dataEsperada,JSON_STYLE
                ).toString().equals(
                    new ReflectionToStringBuilder(
                        dataConsulta==null? StringUtils.EMPTY:dataConsulta,JSON_STYLE
                    ).setExcludeFieldNames("imagenPerfil").toString()
                );
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static CorrespondeAlEmpleado procesado(
        ConsultarEmpleadoParams parametrosConsulta,
        DataEmpleadoExistente dataEsperada
    ) {
        return CorrespondeAlEmpleado.builder()
            .dataEsperada(dataEsperada)
            .parametrosConsulta(parametrosConsulta)
            .build();
    }
}
