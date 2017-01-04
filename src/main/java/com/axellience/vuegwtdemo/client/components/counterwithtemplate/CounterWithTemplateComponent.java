package com.axellience.vuegwtdemo.client.components.counterwithtemplate;

import com.axellience.vuegwt.client.VueComponent;
import jsinterop.annotations.JsType;

import static com.axellience.vuegwtdemo.client.VueTemplatesResources.TEMPLATES;

@JsType
public class CounterWithTemplateComponent extends VueComponent
{
    public int counterValue = 0;

    public CounterWithTemplateComponent()
    {
        this.setTemplate(TEMPLATES.counterWithTemplate());
    }

    public void increaseCounter()
    {
        this.counterValue++;
    }

    public void resetCounter()
    {
        this.counterValue = 0;
    }
}