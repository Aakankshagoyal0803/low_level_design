
import java.util.*;


public class Furniture {
    public static void main(String[] args) {
        System.out.println("Enter furniture type");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        scanner.close();

        IFactory furniture = CreateFurnitue.createFactory(type);
        furniture.createChair().sit();

        furniture.createTable().place();
    }
}

interface ITable {
    void place();
}

interface IChair{
    void sit();
}

class ModernTable implements ITable{
    public void place()
    {
        System.out.println("placing modern table");
    }
}

class ModernChair implements IChair{
    public void sit()
    {
        System.out.println("sitting on modern table");
    }
}

class TraditionalTable implements ITable{
    public void place()
    {
        System.out.println("placing traditional table");
    }
}

class TraditionalChair implements IChair{
    public void sit()
    {
        System.out.println("sitting on traditional table");
    }
}

interface IFactory{
    public IChair createChair();
    public ITable createTable();
}


class ModernFactory implements IFactory{
    public IChair createChair()
    {
        return new ModernChair();
    }

    public ITable createTable()
    {
        return new ModernTable();
    }
}


class TraditionalFactory implements IFactory{
    public IChair createChair()
    {
        return new TraditionalChair();
    }

    public ITable createTable()
    {
        return new TraditionalTable();
    }
}

class CreateFurnitue
{
    public static IFactory createFactory(String type)
    {
        if(type.equals("modern"))
        return new ModernFactory();

        return new TraditionalFactory();
    }
}



