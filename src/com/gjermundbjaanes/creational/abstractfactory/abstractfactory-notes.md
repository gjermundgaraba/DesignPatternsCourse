
# Concepts

* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to Subclasses
* Examples
    * DocumentBuilder
    * Used in frameworks


# Design

* Groups Factories together
* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parametrized create method
* Composition


# Pitfalls

* Complexity
    * Lot of code
    * Lot of stuff going on
* Runtime switch
* Pattern within a pattern
* Problem specific
    * Other patterns solve broader problems
* Starts as a Factory


# Contrast

Factory
* Returns various instances
    * Multiple constructors
* Interface driven
* Adaptable to environment more easily

AbstractFactory
* All the same as the Factory things (see above)
* Implemented with a Factory
* Hides the Factory
* Abstracts Environment
* Built through Composition
