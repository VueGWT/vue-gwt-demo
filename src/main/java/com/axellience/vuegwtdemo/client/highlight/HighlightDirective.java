package com.axellience.vuegwtdemo.client.highlight;

import com.axellience.vuegwt.core.client.directive.VueDirective;
import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsType;

@JsType
public class HighlightDirective extends VueDirective
{
    /**
     * When the component is created
     */
    public void $$inserted(Element element) {
        // Init highlight
        Highlight.highlightBlock(element);
    }
}
