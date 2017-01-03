package com.axellience.vuegwtdemo.client;

import com.google.gwt.resources.client.CssResource;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Simple style
 */
@JsType
public interface BaseStyle extends CssResource
{
    @JsMethod
    String red();
}
