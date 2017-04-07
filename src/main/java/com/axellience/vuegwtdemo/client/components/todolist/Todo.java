package com.axellience.vuegwtdemo.client.components.todolist;

import jsinterop.annotations.JsType;

/**
 * Simple Todo model
 */
@JsType
public class Todo
{
    public String text = "";
    public boolean isDone = false;

    public Todo(String text)
    {
        this.text = text;
    }
}
