package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.client.jsnative.types.JsArray;
import com.axellience.vuegwt.jsr69.annotations.Component;
import com.axellience.vuegwt.jsr69.annotations.Computed;
import jsinterop.annotations.JsType;

/**
 * A simple Todo list.
 * Is able to list some todo, mark them as done, remove done todos or all at the same time.
 */
@Component(components = {TodoComponent.class})
@JsType
public class TodoListComponent extends VueComponent
{
    public JsArray<Todo> todos = new JsArray<>();
    public String newTodoText = "";

    /**
     * Create a new todo
     */
    public void addTodo() {
        this.todos.push(new Todo(this.newTodoText));
        this.newTodoText = "";
    }

    /**
     * Remove the given todo
     * @param todo
     */
    public void removeTodo(Todo todo) {
        this.todos.splice(this.todos.indexOf(todo), 1);
    }

    /**
     * Remove all the todos
     */
    public void clearTodos() {
        this.todos = new JsArray<>();
    }

    /**
     * Remove only the todos that have been done
     */
    public void clearDoneTodos() {
        this.todos = this.todos.filter(value -> !value.isDone);
    }

    /**
     * Will be automatically called by Vue.JS to get the value of in your template doneTodos
     * @return The number of todos that are done
     */
    @Computed
    public int doneTodos() {
        int doneTodos = 0;
        for (Todo todo : this.todos.iterate())
        {
            if (todo.isDone)
                doneTodos++;
        }
        return doneTodos;
    }
}
