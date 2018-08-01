package com.axellience.vuegwtdemo.client.components.counter;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component
public class CounterComponent implements IsVueComponent {

  @Data
  int counterValue = 0;
}