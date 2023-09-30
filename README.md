# low_level_design
low level design learning and practise


Simple Fcatory - 
            encapsulate object creation process.
            have to create similar type of object.
            parent is same for object.
            we create a class factory to create objects
            if else is there in factory class
            example -> logger, product (books, clothes, electronics), Order(take away, dine in, online), parking lot(normal, preganant lady, elder, handicap).
            issue -> factory class is not following open close principle


Factory method - 
            Factort will not be class, it will be interface.
            Interface -> ILoggerFactory, method inside this createLogger()
            DebugLoggerFactory, InfoLoggerFactory will implement ILoggerFactory.
            two intefaces here -> ILogger and ILoggerFactory
            ILogger -> will have log method
            ILoggerFactory -> will have createLogger method.


Abstarct Factory -> 
            -  create family of related and interdependent objects.
            -  combination of both


Builder Design Pattern ->
            - construction process is same
            - configuration is different
            - used in complex system, sql query and json query builde.
            - differnt than factory, bec we are not create template of creating object.
            - here in interface, we are having template to create objects.
            - if we use factory in the example of desktop
            - then there might be case where we forget to add printer and monitor and so on. becuase we are not forcing concrete class to implement such things.

            -- we can use this when we have template that any concrete class should have this. (implement this)
            - disadvantage -> so much code. 
            - 

Prototype design pattern
            - when we want to delegate the process of cloning
            - inside product we can have this method.



Singleton Design Pattern 
            - example - theme (light, dark) --> this should be valid in all classes.
            - configuration class. (only one config object), payment gateway.
            - logger, logger1 -> file1 , logger2 -> file2 (not good) 
            - logger should just one object and write to just one file. 
            - DB Instance. other example (one is writing one is reading  --> system is inconsistent)
            - we want single object of the class then we use singleton

            - private constructor.
            - static instance (belong to class, not to any object)
            -  static getter to return static instance

