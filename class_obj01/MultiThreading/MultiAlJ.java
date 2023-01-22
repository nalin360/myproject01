public class MultiAlJ {
    public static void main(String[] args) throws Exception{

        // setName,getName, setPriority , getPriority
        hi1a obj1 = new hi1a();
        hello11a obj2 = new hello11a();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.setName("Thread 001");

        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();

        t1.join();
        System.out.println(t1.getName());
        System.out.println("Bye");
    }
}

class hi1a implements Runnable
{
    public void run()
    {
        for (int i =0;i <= 5;i++)
        {
            System.out.println("hi");

            try {Thread.sleep(1000);} catch (Exception e){e.printStackTrace();}
        }
        // System.out.println(Thread.currentThread().getName());
        System.out.println();
    }
}

class hello11a implements Runnable
{
    public void run()
    {
        for (int i =0;i <= 5;i++)
        {
            System.out.println("hello");
            try {Thread.sleep(999);} catch (Exception e){e.printStackTrace();}
        }
    }
}