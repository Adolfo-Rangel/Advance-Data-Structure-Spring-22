In Java, an interface is a blueprint for a class that specifies a set of abstract methods that the implementing class must define. It is used to achieve abstraction and multiple inheritance in Java.

Key Features
Abstract Methods:

Interfaces can only have method declarations (no implementation).
Implementing classes must provide the implementation for these methods.
From Java 8, interfaces can also have default methods (with a body) and static methods.
Fields:

Fields in an interface are public, static, and final by default (constants).
Implementation:

A class uses the implements keyword to implement an interface.
A class can implement multiple interfaces (supporting multiple inheritance).

Why Use Interfaces?
Abstraction: Defines behavior without specifying how it’s implemented.
Multiple Inheritance: A class can implement multiple interfaces, unlike extending only one class.
Flexibility: Allows different classes to adhere to the same behavior while implementing it in their own way.
In short, an interface defines what a class must do, but not how it does it.
