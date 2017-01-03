package com.axellience.vuegwtdemo.client.apps;

import com.axellience.vuegwt.client.VueApp;
import jsinterop.annotations.JsType;

@JsType
public class SimpleCounterApp extends VueApp
{
    public int counterValue = 0;

    public SimpleCounterApp()
    {
        this.init("#simpleCounterApp");
    }

    public void increaseCounter()
    {
        this.counterValue++;
    }
}