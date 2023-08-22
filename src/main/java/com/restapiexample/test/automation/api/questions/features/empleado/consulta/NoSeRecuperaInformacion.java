package com.restapiexample.test.automation.api.questions.features.empleado.consulta;

import com.restapiexample.test.automation.api.models.params.features.empleado.consultar.ConsultarEmpleadoParams;
import com.restapiexample.test.automation.api.questions.javadoc.QuestionsJavaDoc;
import lombok.Builder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Para mas informacion:
 * @see QuestionsJavaDoc#CLASE
 */
@Builder
public class NoSeRecuperaInformacion implements Question<Boolean>
{
    private ConsultarEmpleadoParams parametros;

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

        return this.parametros.getRequest().getResponse().getBody().getData()==null;
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static NoSeRecuperaInformacion delEmpleado(
        ConsultarEmpleadoParams parametros
    ) {
        return NoSeRecuperaInformacion.builder()
            .parametros(parametros)
            .build();
    }
}
