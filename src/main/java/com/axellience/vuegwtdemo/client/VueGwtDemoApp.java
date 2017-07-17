package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.client.Vue;
import com.axellience.vuegwt.client.gwtpanel.VueGwtPanel;
import com.axellience.vuegwtdemo.client.components.counter.CounterComponentConstructor;
import com.axellience.vuegwtdemo.client.components.todolist.TodoListComponentConstructor;
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
        // Create a simple GWT panel containing a CounterWithTemplateComponent
        RootPanel
            .get("simpleCounterComponentContainer")
            .add(new VueGwtPanel<>(CounterComponentConstructor.get()));

        Vue.attach("#todoListComponentContainer", TodoListComponentConstructor.get());
    }
}
