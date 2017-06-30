package com.axellience.vuegwtdemo.client.components.todolist;

/**
 * Simple Todo model
 */
public class Todo
{
    private String text = "";
    private boolean isDone = false;

    public Todo(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public boolean isDone()
    {
        return isDone;
    }

    public void setDone(boolean done)
    {
        isDone = done;
    }
}
