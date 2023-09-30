
public class BuilderDemo {
    public static void main(String[] args) {

        DesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Director director = new Director(dellDesktopBuilder);

        director.getDesktop().print();
    }
}


class Desktop{
    String ram;
    String keyboard;

    public void setRam(String ram)
    {
        this.ram = ram;
    }

    public void setKeyboard(String keyboard)
    {
        this.keyboard = keyboard;
    }

    public String getRam()
    {
        return ram;
    }

    public String getKeyboard()
    {
        return this.keyboard;
    }

    public void print()
    {
        System.out.println("Ram is " + getRam());
        System.out.println("keyboard is " + getKeyboard());
    }
}

abstract class DesktopBuilder{
    protected Desktop desktop = new Desktop();

    public abstract void buildRam();
    public abstract void BuildKeyboard();

    public Desktop getDesktop(){
        return desktop;
    }
}

class DellDesktopBuilder extends DesktopBuilder{

    @Override
    public void buildRam() {
        desktop.setRam("dell ram");
    }

    @Override
    public void BuildKeyboard() {
        desktop.setKeyboard("dell keyboard");
    }

}

class MacDesktopBuilder extends DesktopBuilder{

    @Override
    public void buildRam() {
        desktop.setRam("mac ram");
    }

    @Override
    public void BuildKeyboard() {
        desktop.setKeyboard("mac keyboard");
    }
}

class Director{
    private DesktopBuilder builder;

    public Director(DesktopBuilder builder) {
        this.builder = builder;
    }

    public void build()
    {
        builder.BuildKeyboard();
        builder.buildRam();
    }

    public Desktop getDesktop()
    {
        return builder.getDesktop();
    }
}
