package com.axellience.vuegwtdemo.client.components.counter;

import com.axellience.vuegwt.core.client.component.VueComponent;
import com.axellience.vuegwt.core.annotations.component.Component;
import jsinterop.annotations.JsProperty;

@Component
public class CounterComponent extends VueComponent
{
    @JsProperty int counterValue = 0;
}