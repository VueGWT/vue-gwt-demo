package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.annotations.Component;
import com.axellience.vuegwt.jsr69.annotations.Prop;
import jsinterop.annotations.JsType;

/**
 * Display a Todo
 */
@Component
@JsType
public class TodoComponent extends VueComponent
{
    @Prop
    public Todo todo;

    /**
     * Emit an event when we want to delete the todo
     */
    public void removeTodo() {
        this.$emit("removeTodo", this.todo);
    }
}