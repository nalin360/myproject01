public class reClassobj {
    public static void main(String[] args) {

        Abs obj = new Abs();
    }
}

class Abs
{
    public int i;
    public String s = "Hello";

    public Abs()
    {
        System.out.println("Defualt constructors");
    }

    public Abs(int i)
    {
        System.out.println(i);
    }

}

