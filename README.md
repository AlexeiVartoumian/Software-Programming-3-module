# Worksheet on Design Patterns - Part I

## Creational Design Patterns

In these exercises we will be examining the following design patterns (amongst others):

+ Factory Method, and
+ Singleton

------

1. The *Factory Method* pattern gives us a way to encapsulate the instantiations of concrete types; it encapsulates the functionality required to select and instantiate an appropriate class, inside a designated method referred to as a *factory method*.  The factory method selects an appropriate class from a class hierarchy based on the application context and other contributing factors and it then instantiates the selected class and returns it as an instance of the parent class type. The advantage of this approach is that the application objects can make use of the factory method to gain access to the appropriate class instance. This eliminates the need for an application object to deal explicitly with the varying class selection criteria.

	You are required to implement the following classes:
	+ `Product` - defines the interface of objects the factory method creates.
	+ `ConcreteProduct` - implements the `Product` interface.
	+ `Creator` - declares the factory method, which returns an object of type `Product`. 
	   `Creator` may also define a default implementation of the factory method that returns a default `ConcreteProduct` object.We may call the factory method to create a `Product` object.
	+ `ConcreteCreator` - overrides the factory method to return an instance of a `ConcreteProduct`.

	Factory methods, therefore, eliminate the need to bind application-specific classes to your code. In this case, the code only deals with the `Product` interface;  therefore it can work with any user-defined `ConcreteProduct` classes.

5. In this question, we examine the *Singleton* design pattern.
	+ Why might you decide to *lazy-initialise* a singleton instance rather than initialise it in its field declaration? Provide code examples of both approaches to illustrate your answer.
	
	+ There are many ways to break the singleton pattern. One is in a multi-threaded environment but others include:
    	    
	    + If the class is `Serializable`.
	    + If it is `Cloneable`.
	    + It can be broken by reflection.
	    + If the class is loaded by multiple *class loaders*.	
	
	Try and write a class `SingletonProtected` that addresses some (all?) of these issues.

```

```
