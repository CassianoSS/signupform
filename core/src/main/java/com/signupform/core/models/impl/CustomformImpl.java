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
import com.signupform.core.models.Customform;
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
    Customform.class,
    ComponentExporter.class
}, resourceType = "signupform/components/customform")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CustomformImpl
    implements Customform
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String subtitle;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fieldlabelones1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderlabelones1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwolabelone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwoplaceholderone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwolabeltwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwoplaceholdertwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwolabelthree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectiontwoplaceholderthree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreetitle;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreesubtitle;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreelabelone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreeplaceholderone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreelabeltwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreeplaceholdertwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreelabelthree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sectionthreeplaceholderthree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String buttontext;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String submitlink;
    @SlingObject
    private Resource resource;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public String getSectionone() {
        return sectionone;
    }

    @Override
    public String getFieldlabelones1() {
        return fieldlabelones1;
    }

    @Override
    public String getPlaceholderlabelones1() {
        return placeholderlabelones1;
    }

    @Override
    public String getSectiontwo() {
        return sectiontwo;
    }

    @Override
    public String getSectiontwolabelone() {
        return sectiontwolabelone;
    }

    @Override
    public String getSectiontwoplaceholderone() {
        return sectiontwoplaceholderone;
    }

    @Override
    public String getSectiontwolabeltwo() {
        return sectiontwolabeltwo;
    }

    @Override
    public String getSectiontwoplaceholdertwo() {
        return sectiontwoplaceholdertwo;
    }

    @Override
    public String getSectiontwolabelthree() {
        return sectiontwolabelthree;
    }

    @Override
    public String getSectiontwoplaceholderthree() {
        return sectiontwoplaceholderthree;
    }

    @Override
    public String getSectionthreetitle() {
        return sectionthreetitle;
    }

    @Override
    public String getSectionthreesubtitle() {
        return sectionthreesubtitle;
    }

    @Override
    public String getSectionthreelabelone() {
        return sectionthreelabelone;
    }

    @Override
    public String getSectionthreeplaceholderone() {
        return sectionthreeplaceholderone;
    }

    @Override
    public String getSectionthreelabeltwo() {
        return sectionthreelabeltwo;
    }

    @Override
    public String getSectionthreeplaceholdertwo() {
        return sectionthreeplaceholdertwo;
    }

    @Override
    public String getSectionthreelabelthree() {
        return sectionthreelabelthree;
    }

    @Override
    public String getSectionthreeplaceholderthree() {
        return sectionthreeplaceholderthree;
    }

    @Override
    public String getButtontext() {
        return buttontext;
    }

    @Override
    public String getSubmitlink() {
        return submitlink;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
