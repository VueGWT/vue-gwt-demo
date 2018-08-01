package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.axellience.vuegwtdemo.client.components.counter.CounterComponentFactory;
import com.axellience.vuegwtdemo.client.components.todolist.TodoListComponentFactory;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class VueGwtDemoApp implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    VueGWT.init();

    Vue.attach("#simpleCounterComponentContainer", CounterComponentFactory.get());
    Vue.attach("#todoListComponentContainer", TodoListComponentFactory.get());
  }
}
