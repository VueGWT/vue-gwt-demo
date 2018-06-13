package com.axellience.vuegwtdemo.client.components.counter;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import jsinterop.annotations.JsProperty;

@Component
public class CounterComponent implements IsVueComponent {

  @JsProperty
  int counterValue = 0;
}