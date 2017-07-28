package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.client.Vue;
import com.axellience.vuegwt.client.VueGWT;
import com.axellience.vuegwt.client.gwtpanel.VueGwtPanel;
import com.axellience.vuegwtdemo.client.components.counter.CounterComponent;
import com.axellience.vuegwtdemo.client.components.todolist.TodoListComponent;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

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
        VueGWT.initWithVueLib();

        // Create a simple GWT panel containing a CounterWithTemplateComponent
        RootPanel
            .get("simpleCounterComponentContainer")
            .add(new VueGwtPanel<>(CounterComponent.class));

        Vue.attach("#todoListComponentContainer", TodoListComponent.class);
    }
}
