package com.axellience.vuegwtdemo.client.components.counterwithtemplate;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.annotations.Component;
import jsinterop.annotations.JsType;

@Component
@JsType
public class CounterWithTemplateComponent extends VueComponent
{
    public int counterValue = 0;

    public void increaseCounter()
    {
        this.counterValue++;
    }

    public void resetCounter()
    {
        this.counterValue = 0;
    }
}