import java.util.Scanner;

public class AbstractFactory {

        public static void main(String[] args) {
            
        System.out.println("Enter machine OS");
        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        scanner.close();

        OsType osType2;

        if(osType.equals("mac")) osType2 = OsType.MAC;
        else osType2 = OsType.WINDOW;

        IFactory factory = GUIFactory.createFactory(osType2);
        factory.createTextBox().setText();
        factory.createbutton().press();
        
        }

}

enum OsType{
    MAC, WINDOW
}

interface IButton{
    void press();
}

interface ITextBox{
    void setText();
}

class MacButton implements IButton{
    public void press()
    {
        System.out.println("Pressing mac button");
    }
}

class WindowButton implements IButton{
    public void press()
    {
        System.out.println("Pressing win button");
    }
}

class MacTextBox implements ITextBox{
    public void setText()
    {
        System.out.println("setting mac text box");
    }
}

class WindowsTextBox implements ITextBox{
    public void setText()
    {
        System.out.println("setting win text box");
    }
}


interface IFactory{
    IButton createbutton();
    ITextBox createTextBox();
}

class WindowFactory implements IFactory{
    public IButton createbutton()
    {
        System.out.println("creating window button");
        return new WindowButton();
    }

    public ITextBox createTextBox(){
         System.out.println("creating window text box");
        return new WindowsTextBox();
    }
}

class MacFactory implements IFactory{
    public IButton createbutton()
    {
         System.out.println("creating mac button");
        return new MacButton();
    }

    public ITextBox createTextBox(){
         System.out.println("creating mac text box");
        return new MacTextBox();
    }
}


class GUIFactory{
    public static IFactory createFactory(OsType ostype)
    {
         System.out.println(ostype.toString());
        if(ostype == OsType.MAC)
        {
             System.out.println("creating mac factory");
            return new MacFactory();
        }
        else {
             System.out.println("creating window factory");
            return new WindowFactory();
        }
    }
}
