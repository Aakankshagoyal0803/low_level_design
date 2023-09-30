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

