This Grails project was created to test performance issues with Grails fields plugin.

This Grails application have a `TestController` with an `index` action.
index.gsp contains 30 fields rendered by the `fields` plugin.
It performs ok in this project, but the problem is visible in
projects with lots of plugins.
My guess is that the fields plugin scans all plugin views/folders to find field
layouts. It just a guess...

A real application that suffer from bad performance is [gr8crm-demo-app](https://github.com/technipelago/gr8crm-demo-app). This application has a "Contacts" search form and a "Tasks" search form. Tasks uses the fields plugin to render the form. Contacts does not use fields plugin and renders faster. Contacts did use fields plugin earlier and rendered slower than tasks.
