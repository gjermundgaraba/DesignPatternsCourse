
# Concepts

* Components represent part or whole structure
* Compose objects into tree structures
* Individual object treated as a Composite
* Same operations applied on individual and composites
* Examples
    * java.awt.Component
    * JSF widgets
    * RESTful service GETs


# Design

* Tree structured
* Component
* Leaf or Composite, same operations
* Composite knows about child objects
* Component, Leaf, Composite


# Pitfalls

* Can overly simplify system
* Difficult to restrict (everything is handled the same)
    * Less compile time safety
* Implementation can be costly/slow


# Contrast

Composite
* Tree structure
* Leaf and Composite have same interface
* Unity between objects

Decorator
* Contains another entity
* Modifies behavior (adds)
* Doesn't change underlying object