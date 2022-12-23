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
import com.signupform.core.models.Footer;
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
    Footer.class,
    ComponentExporter.class
}, resourceType = "signupform/components/footer")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class FooterImpl
    implements Footer
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String button;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String buttonpath;
    @SlingObject
    private Resource resource;

    @Override
    public String getButton() {
        return button;
    }

    @Override
    public String getButtonpath() {
        return buttonpath;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
