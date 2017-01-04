package com.axellience.vuegwtdemo.client.components.simplecounter;

import com.axellience.vuegwt.client.VueComponent;
import jsinterop.annotations.JsType;

@JsType
public class SimpleCounterComponent extends VueComponent
{
    public int counterValue = 0;

    public void increaseCounter()
    {
        this.counterValue++;
    }
}