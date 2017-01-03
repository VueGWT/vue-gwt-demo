package com.axellience.vuegwtdemo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

/**
 * Resources for demo style
 */
public interface StyleResources extends ClientBundle
{
    StyleResources STYLES = GWT.create(StyleResources.class);

    @Source("baseStyle.gss")
    BaseStyle baseStyle();
}
