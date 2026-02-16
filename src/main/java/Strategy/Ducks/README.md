# Strategy Pattern - Ducks example

> **Note:** I use the term *super class* and *concrete class* to refer to the inheritance relationship of two classes.

## Motivation

I'm imagining that I'm building an app for showcasing ducks.
The ducks are displayed to the users and can perform their quack and fly behavior.

## Implementation notes

> **Principle:** Extract or encapsulate what changes.

The display behavior is the same for all ducks, therefore I will keep it in the `display` method.

On the other hand, the fly and quack behavior can be different for every `Duck`, therefore,
I abstracted it away in two families of algorithms. One for the fly behavior and one for the quack behavior.
Their interfaces are `FlyBehavior` and `QuackBehavior`. The concrete classes that implement the interfaces
will provide the implementation of the behavior.

After the concrete classes that implement `FlyBehavior` and `QuackBehavior` interfaces are instantiated,
they will be composed with one of the concrete classes of the `Duck` `abstract` class.