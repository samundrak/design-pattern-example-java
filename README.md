# Design pattern example java
Example codes of Design Pattern Java 

 
This Example is done as per tutorial from thinkTank.com
Code may looks same but its not copy paste


#Strategy Design Pattern
   In computer programming, the strategy pattern (also known as the policy
   pattern) is a software design pattern that enables an algorithm's behavior to
   be selected at runtime. The strategy pattern. defines a family of algorithms,
   encapsulates each algorithm, and. makes the algorithms interchangeable within
   that family. - WikiPedia

#Observer Design Pattern
   The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called
   observers, and notifies them automatically of any state changes, usually by calling one of their methods. It is mainly used to      
   implement   distributed event handling systems. The Observer pattern is also a key part in the familiar model–view–controller (MVC)
   architectural pattern.[1] The observer pattern is implemented in numerous programming libraries and systems, including almost all GUI
   toolkits.
   
   The observer pattern can cause memory leaks, known as the lapsed listener problem, because in basic implementation it requires both
   explicit registration and explicit deregistration, as in the dispose pattern, because the subject holds strong references to the
   observers, keeping them alive. This can be prevented by the subject holding weak references to the observers. - Wikipedia
   

#Factory Design Pattern
  In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem
    of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects
    by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and
    optionally overridden by derived classes—rather than by calling a constructor. - Wikipedia

#Builder Design Pattern
  Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes
  under creational pattern as this pattern provides one of the best ways to create an object.
  
  A Builder class builds the final object step by step. This builder is independent of other objects. -  (http://www.tutorialspoint.com/design_pattern/builder_pattern.htm) TutorialsPoint
