package com.axellience.vuegwtdemo.client.highlight;

import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "hljs")
public class Highlight
{
    public static native void highlightBlock(Element element);
}
