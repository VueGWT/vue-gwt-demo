package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.annotations.Component;
import com.axellience.vuegwt.jsr69.annotations.Computed;
import jsinterop.annotations.JsType;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A simple Todo list.
 * Is able to list some todo, mark them as done, remove done todos or all at the same time.
 */
@Component(components = { TodoComponent.class })
@JsType
public class TodoListComponent extends VueComponent
{
    public List<Todo> todos;
    public String newTodoText = "";

    @Override
    public void created()
    {
        this.todos = new LinkedList<>();
    }

    /**
     * Create a new todo
     */
    public void addTodo()
    {
        this.todos.add(new Todo(this.newTodoText));
        this.newTodoText = "";
    }

    /**
     * Remove the given todo
     * @param todo
     */
    public void removeTodo(Todo todo)
    {
        this.todos.remove(todo);
    }

    /**
     * Remove all the todos
     */
    public void clearTodos()
    {
        this.todos = new LinkedList<>();
    }

    /**
     * Remove only the todos that have been done
     */
    public void clearDoneTodos()
    {
        this.todos = this.todos.stream().filter(value -> !value.isDone).collect(
            Collectors.toList());
    }

    /**
     * Will be automatically called by Vue.JS to get the value of in your template doneTodos
     * @return The number of todos that are done
     */
    @Computed
    public int doneTodos()
    {
        if (this.todos == null)
            return 0;

        int doneTodos = 0;
        for (Todo todo : this.todos)
        {
            if (todo.isDone)
                doneTodos++;
        }
        return doneTodos;
    }
}
