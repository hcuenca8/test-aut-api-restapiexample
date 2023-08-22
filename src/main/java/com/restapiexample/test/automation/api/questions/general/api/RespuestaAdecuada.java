package com.restapiexample.test.automation.api.questions.general.api;

import com.restapiexample.test.automation.api.models.params.general.api.RespuestaPeticionParams;
import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.models.scena.screenplay.Protagonista;
import com.restapiexample.test.automation.api.questions.javadoc.QuestionsJavaDoc;
import lombok.Builder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.lang3.StringUtils;

/**
 * Para mas informacion:
 * @see QuestionsJavaDoc#CLASE
 */
@Builder
public class RespuestaAdecuada implements Question<Boolean>
{
    private RespuestaPeticionParams parametros;

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
        Libreto libreto = Protagonista.enEscena().getLibreto();

        return this.parametros.getCodigo() == libreto.getUltimaSolicitud().getResponse().getCodigo()
            &&  this.parametros.getEstado().equals(
                libreto.getUltimaSolicitud().getResponse().getBody().getEstado())
            &&  StringUtils.containsIgnoreCase(
                    libreto.getUltimaSolicitud().getResponse().getBody().getMensaje(),
                    this.parametros.getMensaje()
                );
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static RespuestaAdecuada delSistema(RespuestaPeticionParams parametros)
    {
        return RespuestaAdecuada.builder()
            .parametros(parametros)
            .build();
    }
}
