package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.axellience.vuegwtdemo.client.components.counter.CounterComponent;
import com.axellience.vuegwtdemo.client.components.todolist.TodoListComponent;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class VueGwtDemoApp implements EntryPoint
{
    /**
     * This is the entry point method.
     */
    public void onModuleLoad()
    {
        VueGWT.init();

        // Create a simple GWT panel containing a CounterComponent
        Vue.attach("#simpleCounterComponentContainer", CounterComponent.class);
        Vue.attach("#todoListComponentContainer", TodoListComponent.class);
    }
}
