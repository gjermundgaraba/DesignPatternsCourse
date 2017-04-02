
# Concepts

* Also called a wrapper
* Add behavior without affecting others
* Mote than just inheritance
* Single Responsibility Principle
* Compose behavior dynamically
* Examples:
    * java.io.InputStream
    * java.util.Collections#checkedList
    * AWT/Swing UI components


# Design

* Inheritance based
* More than just inheritance though
* Utilizes composition and inheritance (is-a, has-a)
* Alternative to subclassing
* Constructor requires instance from hierarchy


# Pitfalls

* New class for every feature added (I personally like this)
* Often confused with simple inheritance


# Contrast

Composite
* Tree structure
* Leaf and Composite have same interface
* Unity between objects

Decorator
* Contains another entity
* Modifies behavior (adds)
* Doesn't change underlying object