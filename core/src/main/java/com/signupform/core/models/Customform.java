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

package com.signupform.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code Customform} Sling Model used for the {@code signupform/components/customform} component.
 * 
 */
@ConsumerType
public interface Customform
    extends ComponentExporter
{


    String getTitle();

    String getSubtitle();

    String getSectionone();

    String getFieldlabelones1();

    String getPlaceholderlabelones1();

    String getSectiontwo();

    String getSectiontwolabelone();

    String getSectiontwoplaceholderone();

    String getSectiontwolabeltwo();

    String getSectiontwoplaceholdertwo();

    String getSectiontwolabelthree();

    String getSectiontwoplaceholderthree();

    String getSectionthreetitle();

    String getSectionthreesubtitle();

    String getSectionthreelabelone();

    String getSectionthreeplaceholderone();

    String getSectionthreelabeltwo();

    String getSectionthreeplaceholdertwo();

    String getSectionthreelabelthree();

    String getSectionthreeplaceholderthree();

    String getButtontext();

    String getSubmitlink();

}
