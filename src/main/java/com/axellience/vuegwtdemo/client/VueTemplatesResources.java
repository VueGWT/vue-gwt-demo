package com.axellience.vuegwtdemo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Templates for the GWT Vue components
 */
public interface VueTemplatesResources extends ClientBundle
{
    VueTemplatesResources TEMPLATES = GWT.create(VueTemplatesResources.class);

    @Source("components/counterwithtemplate/CounterWithTemplateComponent.html")
    TextResource counterWithTemplate();

    @Source("components/todolist/TodoListComponent.html")
    TextResource todoList();

    @Source("components/todolist/TodoComponent.html")
    TextResource todo();
}
