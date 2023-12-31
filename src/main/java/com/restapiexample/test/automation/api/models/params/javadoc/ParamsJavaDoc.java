package com.restapiexample.test.automation.api.models.params.javadoc;

import com.restapiexample.test.automation.api.constants.enums.tablasgherkin.PlantillaTblGherkin;
import com.restapiexample.test.automation.api.models.scena.Libreto;
import com.restapiexample.test.automation.api.utils.GeneralUtil;

/**
 * Clase que centraliza la documentacion asociada al concepto de paso-parametros (Params), dentro de la arquitectura
 */
public class ParamsJavaDoc {

    /**
     * Clase que representa el conjunto de parametros, habitualmente descritos por una tabla gherkin
     * NO OLVIDE REGISTRAR LOS PARAMETROS EN EL LIBRETO, PARA HABILITAR SU USO
     * @see Libreto
     */
    public static final String CLASE = null;

    /**
     * Metodo que facilita la creacion del objeto de parametros, habitualmente conectado desde la configuracion de una
     * tabla gherkin
     * @see PlantillaTblGherkin
     */
    public static final String CREAR_PARAMS = null;

    private ParamsJavaDoc()
    {
        GeneralUtil.noPermitaInstanciar();
    }

}
