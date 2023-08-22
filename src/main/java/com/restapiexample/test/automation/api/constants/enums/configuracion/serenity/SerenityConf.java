package com.restapiexample.test.automation.api.constants.enums.configuracion.serenity;


import com.restapiexample.test.automation.api.utils.serenity.conf.SerenityConfUtil;

public enum SerenityConf implements SerenityConfUtil.ISerenityConf
{

    URL_BASE("api.url.endpoint"),
    ;

    private final String propiedad;

    SerenityConf(String propiedad)
    {
        this.propiedad = propiedad;
    }

    @Override
    public String getPropiedad()
    {
        return this.propiedad;
    }

}
