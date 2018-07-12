package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.axellience.vuegwtdemo.client.components.counter.CounterComponentFactory;
import com.axellience.vuegwtdemo.client.components.todolist.TodoListComponentFactory;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class VueGwtDemoApp {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    VueGWT.init();

    Vue.attach("#simpleCounterComponentContainer", CounterComponentFactory.get());
    Vue.attach("#todoListComponentContainer", TodoListComponentFactory.get());
  }
}
