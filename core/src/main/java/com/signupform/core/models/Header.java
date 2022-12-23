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
 * Defines the {@code Header} Sling Model used for the {@code signupform/components/header} component.
 * 
 */
@ConsumerType
public interface Header
    extends ComponentExporter
{


    String getLogo();

    String getAboutus();

    String getAboutuspath();

    String getProducts();

    String getProductspath();

    String getStore();

    String getStorepath();

    String getHelp();

    String getHelppath();

    String getCart();

    String getCartpath();

    String getSearch();

}
