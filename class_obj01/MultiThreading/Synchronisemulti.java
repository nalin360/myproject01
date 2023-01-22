import org.w3c.dom.css.Counter;
/*
* synchronized ---
* */
public class Synchronisemulti  {
    public static void main(String[] args) throws Exception{
        counter c = new counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 5;i<= 1000;i++)
                {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 5;i<= 1000;i++)
                {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count " + c.count);
    }
}

class counter
{
    int count;

    public synchronized void increment()
    {
        count++;
    }
}