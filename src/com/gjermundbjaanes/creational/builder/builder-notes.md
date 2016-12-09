
# Concepts

* Handles complex constructors
* Large number of parameters
* Immutability (You can force immutability)
* Examples:
    * StringBuilder
    * DocumentBuilder
    * Locale.Builder


# Design

* Flexibility over telescoping constructors
* Static inner class
* Calls appropriate constructor
* Negates the need for exposed setter everywhere


# Pitfalls

Not too much pitfalls, but somethings to keep in mind

* Immutable
* Inner static class
* Designed first
* Some complexity (not too bad though)


# Contrasts

Builder
* Handles complex constructors
* No interface required
* Can be a separate class
* Works with legacy code (without having to change it)

Prototype
* Implemented around a clone
* Avoids calling complex constructor
* Difficult to implement in legacy code