# Factory Method
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

# Problem
Imagine that you're creating a chat bot application. The first version of your app can only handle chat command by !hello text, so the bulk of your code lives inside the WelcomeChat class.
After a while, your app becomes pretty popular. Each day you receive dozens of request from another users to add new feature into the app.

Great news, right? But how about you code? At present, most of your code is coupled to the WelcomeChat class. Adding Products into the app would require making changes to the entire codebase.
Moreover, if later you decide to add another type of features to the app, you will probably need to make all of these changes again.

As a result, you will end up with pretty nasty code, riddled with conditionals that switch the app's behavior depending on the class of feature objects.

# Solution
The Factory Method Pattern suggests that you replace direct object contruction calls (using the new chat) with calls to a special factory method. Don't worry: the objects are sill created via the new chat, but it's being called from within the factory method.
Objects returned by a factory method are often referred to as "products".
