
# Concepts

* Only one instance created
* Guarantees control of a resource
* Can be lazily loaded (often is)
* Examples:
    * Runtime
    * Logger
    * Spring Beans
    * Graphic Managers


# Design

* Class is responsible for lifecycle
* Static in nature
* Needs to be thread safe
* Private instance
* Private constructor
* No parameters required for construction (if you do, it sounds more like a factory pattern is what you want)


# Pitfalls

* Often overused (since it is very simple)
* Difficult to unit test
* If not careful, not thread-safe
* Sometimes confused for Factory


# Contrast

Singleton
* Returns the same instance every time
    * One constructor method - no args (method, not actual constructor - that one is private)
* No Interface involved

Factory
* Returns various instances (various types)
    * Multiple constructors
* Interface driven
* Adaptable to environment more easily