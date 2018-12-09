# Vue GWT Demo

Simple demo GWT app using [Vue GWT](https://github.com/Axellience/vue-gwt).

Vue GWT integrates [Vue.js](https://vuejs.org/) with [GWT](http://www.gwtproject.org/) 2.8 using [JsInterop](https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/view).

Vue GWT makes heavy use of Vue.js, it's recommended to read [Vue.js introduction guide](https://vuejs.org/v2/guide/) if you are not familiar with it.

This demo uses [Materialize](http://materializecss.com) for the style, but you can use any CSS framework you wish.

> We are looking for feedback and contributions.
If you use it on a small project, please [let us know how it goes](https://gitter.im/Axellience/vue-gwt).

## J2CL Branch

This branch is a simple example of Maven + Vue GWT + J2CL.
To start Dev Mode:
```
mvn -Pdevmode
```

To start Dev Mode with full Closure Optimizations:

In `pom.xml` add under `<argument>com.axellience.vuegwtdemo.client.VueGwtDemoApp</argument>`:
```xml
<argument>--compilation_level</argument>
<argument>ADVANCED_OPTIMIZATIONS</argument>
```

Then run the Dev Mode:
```
mvn -Pdevmode
```

Note that this is very much an alpha, some bug might exist (especially with observation).