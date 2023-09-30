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

interface ILoggerFactory{
    public ILogger createLogger();
}

class DebugFactory implements ILoggerFactory{
    public ILogger createLogger()
    {
        return new DebugLogger();
    }
}

class InfoFactory implements ILoggerFactory{
    public ILogger createLogger()
    {
        return new InfoLogger();
    }
}

class ErrorFactory implements ILoggerFactory{
    public ILogger createLogger()
    {
        return new ErrorLogger();
    }
}




public class FcatoryMethod {
    public static void main(String[] args) {
        System.out.println("welcome");

        ILoggerFactory debugFactory = new DebugFactory();
        ILoggerFactory infoFactory = new InfoFactory();
        ILoggerFactory errorFactory = new ErrorFactory();

        debugFactory.createLogger().log("DEBUG");
        infoFactory.createLogger().log("INFO");
        errorFactory.createLogger().log("ERROR");
    }
}
