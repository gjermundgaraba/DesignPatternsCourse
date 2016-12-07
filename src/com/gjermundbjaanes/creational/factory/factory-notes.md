
# Concepts

* Doesn't expose instantiation logic
* Defer to subclasses (can return different subclasses)
* Common interface
* Specified by architecture, implemented by user (think framework)
* Examples
    * Calendar
    * ResourceBundle
    * NumberFormat


# Design

* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parametrized create method


# Pitfalls

* Complexity
    * A lot of code involved
* Creation in subclasses
* Refactoring not easy, stuff up-front


# Contrast

Singleton
* Returns same instance
    * One constructor method - no args
* No Interface
* No Subclasses

Factory
* Returns various instances
    * Multiple constructors
* Interface driven
* Subclasses
* Adaptable to environment more easily