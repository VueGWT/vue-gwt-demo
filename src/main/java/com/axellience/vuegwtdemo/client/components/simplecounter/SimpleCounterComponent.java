package com.axellience.vuegwtdemo.client.components.simplecounter;

import com.axellience.vuegwt.client.VueComponent;
import jsinterop.annotations.JsType;

import static com.axellience.vuegwtdemo.client.VueTemplatesResources.TEMPLATES;

@JsType
public class SimpleCounterComponent extends VueComponent
{
    public int counterValue = 0;

    public SimpleCounterComponent()
    {
        this.init("simple-counter", TEMPLATES.simpleCounter());
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