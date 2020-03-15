//there are 2 thing that I can do in this file
//1.specify if I want to use any other modules, to do this I use "requires" (line 8)in the body and then the name of the module

//2.the second thing that I can do in this file is : export package from my module , at the moment nobody can use my
// Greeting class, but if I add "export" (line 9) this will make helloWorld package available to the hole world


// this is real modularization , choosing what can and what can not be seen by the outside world.

module AdvancedJavaProgrammingII {
    requires java.desktop;
    exports helloWorld;

}