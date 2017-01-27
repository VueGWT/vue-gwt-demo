package com.axellience.vuegwtdemo.client.components.simplecounter;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.annotations.Component;
import jsinterop.annotations.JsType;

@Component
@JsType
public class SimpleCounterComponent extends VueComponent
{
    public int counterValue = 0;

    public void increaseCounter()
    {
        this.counterValue++;
    }
}