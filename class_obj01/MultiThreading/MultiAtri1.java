public class MultiAtri1 {
    public static void main(String[] args) {

        currentT obj1 = new currentT();
        obj1.start();
    }
}

class currentT extends Thread
{
    // current thread
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

}
