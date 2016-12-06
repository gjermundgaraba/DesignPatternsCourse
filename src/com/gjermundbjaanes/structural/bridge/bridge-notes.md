# Concepts

* Decouple Abstraction and Implementation
* Encapsulation, Composition, Inheritance
* Changes in Abstraction won't affect client
* So two parts of the application can change without effecting each other
* Details won't be right
* Examples:
    * Driver
    * JDBC
    
    
    
# Design

* Interfaces and Abstract classes
* Composition over Inheritance
* More than Composition


# Pitfalls

* Increases complexity
* Conceptually difficult to plan (bad for Agile?)
* More than just OO
* Confusing, what goes where
* I don't like it!

# Contrast

Bridge:
* Designed upfront
* Abstraction and implementation vary
* Built in advance
* Complex

Adapter
* Works after code is designed
* Intended for Legacy code (tie in legacy code with newer stuff)
* Usually retrofitted in
* Provides different interface