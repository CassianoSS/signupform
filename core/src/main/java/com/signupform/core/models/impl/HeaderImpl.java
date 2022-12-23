/*
 * ***********************************************************************
 * Cassiano Simas CONFIDENTIAL
 * ___________________
 *
 * Copyright 2022 Cassiano Simas.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of Cassiano Simas and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to Cassiano Simas
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Cassiano Simas.
 * ***********************************************************************
 */

package com.signupform.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.signupform.core.models.Header;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    Header.class,
    ComponentExporter.class
}, resourceType = "signupform/components/header")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class HeaderImpl
    implements Header
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String logo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String aboutus;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String aboutuspath;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String products;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String productspath;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String store;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String storepath;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String help;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String helppath;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String cart;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String cartpath;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String search;
    @SlingObject
    private Resource resource;

    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public String getAboutus() {
        return aboutus;
    }

    @Override
    public String getAboutuspath() {
        return aboutuspath;
    }

    @Override
    public String getProducts() {
        return products;
    }

    @Override
    public String getProductspath() {
        return productspath;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public String getStorepath() {
        return storepath;
    }

    @Override
    public String getHelp() {
        return help;
    }

    @Override
    public String getHelppath() {
        return helppath;
    }

    @Override
    public String getCart() {
        return cart;
    }

    @Override
    public String getCartpath() {
        return cartpath;
    }

    @Override
    public String getSearch() {
        return search;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
