public class NewClassInterface {
    public static void main(String[] args) {
        A11 obj1 = new A11();
        obj1.print1();
    }
}

interface Ab1
{
    void print1();
}

class A11 implements Ab1
{
    public void print1()
    {
        System.out.println("hi");
    }
}
