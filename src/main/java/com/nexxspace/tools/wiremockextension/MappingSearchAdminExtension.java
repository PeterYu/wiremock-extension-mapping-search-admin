package com.nexxspace.tools.wiremockextension;

import com.github.tomakehurst.wiremock.admin.Router;
import com.github.tomakehurst.wiremock.extension.AdminApiExtension;

public class MappingSearchAdminExtension implements AdminApiExtension {
    @Override
    public void contributeAdminApiRoutes(Router router) {

    }

    @Override
    public String getName() {
        return null;
    }
}
