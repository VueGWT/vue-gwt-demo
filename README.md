# Vue GWT Demo

Simple demo GWT app using [Vue GWT](https://github.com/Axellience/vue-gwt).

Vue GWT is a wrapper of [Vue.JS](https://vuejs.org/) using [GWT](http://www.gwtproject.org/) 2.8 and [JsInterop](https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/view).

Vue GWT makes heavy use of Vue.JS, it's recommended to read [Vue.JS introduction guide](https://vuejs.org/v2/guide/) if you are not familiar with it.

This demo uses [Materialize](http://materializecss.com) for the style, but you can use any CSS framework you wish.

This demo is composed of two parts:

* A Counter
* A Todo List

## Counter

Vue.JS Features used

* Watch values
* Computed Values

The `CounterComponent` displays a simple `Press me` button.
Each time the button is pressed, the counter value increases.
A reset button reset the value of the counter to 0.

It also displays a `Computed value` and a `Watched value` bellow the counter.

The `watched value` uses Vue.JS watch mechanism.
Each time the `counterValue` change, a Java method gets called on the component and update `counterValueDivide2` to `counterValue/2`.

The `compted value` uses Vue.JS computed value mechanism.
Each time Vue.JS needs to display this value, it calls a method on the component to get it.
In this case this methods always returns `counterValue*2`.

```html
<div>
	<a class="btn orange" v-on:click="increaseCounter">
		<span v-if="counterValue > 0">Pressed {{ counterValue }} times</span>
		<span v-if="counterValue == 0">Press me!</span>
	</a>
	<p>
		Computed Value: {{ counterValuex2 }}, Watched Value: {{ counterValueDivide2 }}
	</p>
	<a class="btn grey" v-on:click="resetCounter">
		Reset
	</a>
</div>
```

```java
/**
 * Simple component displaying a counter
 */
@JsType
public class CounterComponent extends VueComponent
{
    public int counterValue        = 0;
    public int counterValueDivide2 = 0;

    public CounterComponent()
    {
        this.init("counter", TEMPLATES.counter());
    }

    public void increaseCounter()
    {
        this.counterValue++;
    }

    public void resetCounter()
    {
        this.counterValue = 0;
    }

    /**
     * This method will be called by Vue.JS each time "counterValue" changes
     */
    public void watch_counterValue()
    {
        this.counterValueDivide2 = this.counterValue / 2;
    }

    /**
     * This method will be called by Vue.JS to get the value of counterValuex2
     * @return The value of counterValue multiplied by 2
     */
    public int computed_counterValuex2()
    {
        return this.counterValue * 2;
    }
}
```

## Todo List

Vue.JS Features used:

* Computed values
* Properties (Component parameters)
* Event emitters
* Conditional rendering
* Keyboard events

A simple todo list that can:

* Create new todos
* Mark todos as done
* Remove a given todo
* Clear done todos
* Clear all todos

It is composed of two components:

* TodoListComponent
* TodoComponent

### TodoComponent

Simple component created for every todo in the list.
It display the todo title, a checkbox to mark as done, and a delete button.

The todo to display is passed as a property by the list.

When the delete button is pressed, this component emits an event to it's parent to delete the todo it displays.

### TodoListComponent

Displays the list of all the todos.
It is responsible for creating/deleting them.

Contains:

* A text field to set the text of the todo to create
* A button to delete all todos
* A button to clear the todos that are done