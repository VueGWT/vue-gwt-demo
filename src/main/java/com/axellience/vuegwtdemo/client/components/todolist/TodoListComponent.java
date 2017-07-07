package com.axellience.vuegwtdemo.client.components.todolist;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.client.jsnative.types.JsArray;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import com.axellience.vuegwt.jsr69.component.annotations.Computed;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A simple Todo list.
 * Is able to list some todo, mark them as done, remove done todos or all at the same time.
 */
@JsType
@Component(components = { TodoComponent.class })
public class TodoListComponent extends VueComponent
{
    @JsProperty protected JsArray<Todo> todos;
    @JsProperty protected String newTodoText;

    @Override
    public void created()
    {
        this.todos = new JsArray<>();
        this.newTodoText = "";
    }

    public void addTodo()
    {
        this.todos.push(new Todo(this.newTodoText));
        this.newTodoText = "";
    }

    public void removeTodo(Todo todo)
    {
        this.todos.splice(this.todos.indexOf(todo), 1);
    }

    public void clearTodos()
    {
        this.todos = new JsArray<>();
    }

    public void clearDoneTodos()
    {
        this.todos = this.todos.filter(todo -> !todo.isDone());
    }

    /**
     * Will be automatically called by Vue.js to
     * get the value of doneTodos in the template
     * @return The number of todos that are done
     */
    @Computed
    public int doneTodos()
    {
        if (this.todos == null)
            return 0;

        return this.todos.reduce((counter, todo) -> todo.isDone() ? counter + 1 : counter, 0);
    }
}
