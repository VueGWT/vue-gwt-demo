package com.axellience.vuegwtdemo.client.components.counterwithtemplate;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Component
@JsType
public class CounterWithTemplateComponent extends VueComponent
{
    @JsProperty
    protected int counterValue = 0;

    @Override
    public void created()
    {

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