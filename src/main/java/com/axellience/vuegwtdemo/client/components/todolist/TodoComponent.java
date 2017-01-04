package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.VueComponent;
import jsinterop.annotations.JsType;

import static com.axellience.vuegwtdemo.client.VueTemplatesResources.TEMPLATES;

/**
 * Display a Todo
 */
@JsType
public class TodoComponent extends VueComponent
{
    protected Todo todo;

    public TodoComponent()
    {
        this.setTemplate(TEMPLATES.todo());
        this.addProp("todo");
    }

    /**
     * Emit an event when we want to delete the todo
     */
    public void removeTodo() {
        this.$emit("removeTodo", this.todo);
    }
}