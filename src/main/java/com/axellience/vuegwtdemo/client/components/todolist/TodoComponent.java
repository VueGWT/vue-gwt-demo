package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import com.axellience.vuegwt.jsr69.component.annotations.Prop;
import jsinterop.annotations.JsType;

/**
 * Display a Todo
 */
@JsType
@Component
public class TodoComponent extends VueComponent
{
    @Prop public Todo todo;

    @Override
    public void created()
    {

    }

    /**
     * Emit an event when we want to delete the todo
     */
    public void removeTodo()
    {
        this.$emit("removeTodo", todo);
    }
}