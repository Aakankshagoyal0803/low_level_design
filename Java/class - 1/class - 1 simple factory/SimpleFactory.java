enum Logger{
    DEBUG, INFO, ERROR
}

interface ILogger{
    public void log(String str);
}

class DebugLogger implements ILogger{
    public void log(String str)
    {
        System.out.println("Logging from debug logger " + str);
    }
}

class InfoLogger implements ILogger{
    public void log(String str)
    {
        System.out.println("Logging from info logger " + str);
    }
}


class ErrorLogger implements ILogger{
    public void log(String str)
    {
        System.out.println("Logging from error logger " + str);
    }
}

class LoggerFactory{
    // making it static.
    public static ILogger createLogger(Logger logger)
    {
        if(logger == Logger.DEBUG)
        {
            return new DebugLogger();
        }
        else if(logger == Logger.INFO)
        {
            return new InfoLogger();
        }
        else return new ErrorLogger();
    }
}


public class SimpleFactory{
    public static void main(String[] args) {
        
        ILogger debug = LoggerFactory.createLogger(Logger.DEBUG);
        ILogger info = LoggerFactory.createLogger(Logger.INFO);
        ILogger error = LoggerFactory.createLogger(Logger.ERROR);

        debug.log("debugging");
        error.log("error");
        info.log("infor");
    }
}