package com.axellience.vuegwtdemo.client;

import com.axellience.vuegwt.client.gwtextension.VueGwtPanel;
import com.axellience.vuegwt.client.jsnative.Vue;
import com.axellience.vuegwtdemo.client.components.counterwithtemplate.CounterWithTemplateComponent;
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
        // Create a simple GWT panel containing a CounterWithTemplateComponent
        RootPanel
            .get("simpleCounterComponentContainer")
            .add(new VueGwtPanel<>(CounterWithTemplateComponent.class));

        Vue.attach("#todoListComponentContainer", TodoListComponent.class);
    }
}
