public class Abs1 {
    public static void main(String[] args) {
        Samsung obj1 = new Samsung();
        obj1.camera();
        obj1.games();

    }
}

abstract class Iphone
{
    public void call()
    {
        System.out.println("Calling...");
    }

    public abstract void camera();
    public abstract void songs();
    public abstract void games();
}

class Samsung extends Iphone
{
    public void camera()
    {
        System.out.println("Camera apps");
    }

    public void songs()
    {
        System.out.println("nTunes");
    }

    public  void games()
    {
        System.out.println("PUBG");
    }
}