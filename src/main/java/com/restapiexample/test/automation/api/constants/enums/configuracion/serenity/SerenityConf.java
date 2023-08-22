package com.restapiexample.test.automation.api.constants.enums.configuracion.serenity;


import com.restapiexample.test.automation.api.utils.serenity.conf.SerenityConfUtil;

public enum SerenityConf implements SerenityConfUtil.ISerenityConf
{

    URL_BASE("api.url.base"),
    PATH_GET_EMPLOYEE("api.url.path.get_employee"),
    PATH_GET_EMPLOYEES("api.url.path.get_employees"),
    PATH_PST_CREATE("api.url.path.pst_create"),
    PATH_PUT_UPDATE("api.url.path.put_update"),
    PATH_DEL_DELETE("api.url.path.del_delete"),
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
