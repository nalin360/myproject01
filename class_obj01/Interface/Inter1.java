public class Inter1 {
    public static void main(String[] args) {

        // interface by anonymous class
        Aib obj1 = new Aib()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
    }
}

interface Aib
{
    public void show();
}


