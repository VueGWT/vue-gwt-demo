package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.component.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import com.axellience.vuegwt.jsr69.component.annotations.Computed;
import com.axellience.vuegwt.jsr69.component.annotations.Prop;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

/**
 * Display a Todo
 */
@Component
public class TodoComponent extends VueComponent
{
    @Prop
    @JsProperty
    Todo todo;

    /**
     * Emit an event when we want to delete the todo
     */
    @JsMethod
    public void removeTodo()
    {
        this.$emit("removeTodo", todo);
    }

    @Computed
    public boolean getIsDoneTodo()
    {
        return this.todo.isDone();
    }

    @Computed
    public void setIsDoneTodo(boolean isDone)
    {
        this.todo.setDone(isDone);
    }
}