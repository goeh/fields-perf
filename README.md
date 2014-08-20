This Grails project was created to test performance issues with Grails fields plugin.

This Grails application have a TestController with an +index+ action.
index.gsp contains 30 fields rendered by the +fields+ plugin.
It performs ok in this project, but the problem is visible in
projects with lots of plugins.
My guess is that the field splugin scans all plugin views/folders to find field
layouts. It just a guess...
