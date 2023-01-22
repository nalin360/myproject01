public class Re_Stactic {

    int i;
    public static void main(String[] args) {

        Bbs.show();

    }
}

class Bbs
{
    /*
    when a class has static keyword this means we
    don't need any object to call in main class or instantiate
    * */
    public static void show()
    {
        System.out.println("Hi, its a static function");
    }
}
