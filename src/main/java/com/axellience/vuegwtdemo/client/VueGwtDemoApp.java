package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.axellience.vuegwtdemo.client.components.counter.CounterComponent;
import com.axellience.vuegwtdemo.client.components.todolist.TodoListComponent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class VueGwtDemoApp {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    VueGWT.init();

    // Create a simple GWT panel containing a CounterComponent
    Vue.attach("#simpleCounterComponentContainer", CounterComponent.class);
    Vue.attach("#todoListComponentContainer", TodoListComponent.class);
  }
}
