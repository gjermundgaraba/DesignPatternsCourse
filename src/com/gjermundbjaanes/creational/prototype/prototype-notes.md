
# Concepts

Can be thought of as a refactoring pattern

* Avoids costly creation
* Avoids subclassing
* Typically doesn't use "new"
* Often utilizes an Interface
* Usually implemented with a Registry
* Example
    * java.lang.Object#clone()


# Design

* Clone / Cloneable
* Avoids keyword "new"
* Although a copy, each instance is unique
* Costly construction not handled by client
* Can still utilize parameters for constructions
* Shallow VS Deep Copy


# Pitfalls

* Not used much
    *Sometimes not clear when to use
* Used with other patterns
    * Registry
    * Can become a "framework" quickly
* Shallow VS Deep Copy


# Contrast

Prototype
* Lighter weight construction
    * Copy Constructor or CLone
* Shallow or Deep
* Copy of itself

Factory
* Flexible Objects
    * Multiple constructors
* Concrete Instance
* Fresh Instance