public class MultiT1 {
    // using Extending Thread Class
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello1 obj2 = new hello1();
        obj1.start();
        obj2.start();

    }
}

class hi extends Thread
{
    public void run()
    {
        for (int i =0;i <= 5;i++)
        {
            System.out.println("hi");
            try {Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

class hello1 extends Thread
{
    public void run()
    {
        for (int i =0;i <= 5;i++)
        {
            System.out.println("hello");
            try {Thread.sleep(999);} catch (Exception e){}
        }
    }
}