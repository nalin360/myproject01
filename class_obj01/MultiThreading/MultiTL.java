public class MultiTL {
    public static void main(String[] args) throws Exception {

        // isAlive and Join

        hii1 obj1 = new hii1();
        hello211 obj2 = new hello211();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Bye");
        System.out.println(t1.isAlive());

    }
}

class hii1 implements Runnable
{
    public void run()
    {
        for (int i =0;i <= 5;i++)
        {
            System.out.println("hi");
            //System.out.println(Thread.currentThread().getName());
            //
            try {Thread.sleep(1000);} catch (Exception e){ e.printStackTrace();}
        }
    }
}

class hello211 implements Runnable
{
    public void run()
    {
        for (int i =0;i <= 5;i++)
        {
            System.out.println("hello");
            //System.out.println(Thread.currentThread().getName());
            try {Thread.sleep(999);} catch (Exception e){e.printStackTrace();}
        }
    }
}