package com.axellience.vuegwtdemo.client.components.counter;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
@Component
public class CounterComponent extends VueComponent
{
    @JsProperty
    protected int counterValue;

    @Override
    public void created()
    {
        this.counterValue = 0;
    }
}