public class Non_Access_static {
    /*
    When a member is declared static,
    it can be accessed before
    any objects of its class are created,
    and without reference to any object.
    */
    public static void main(String[] args) {

        Access obj = new Access();
        // this is not static called by an object
        obj.show01();
        // this is static we can call this method
        // without reference to an object
        Access.show();

        // static variable
        // accessing not static

        obj.i =5;
        // accessing non static
        Access.get_static = 0;
    }
}

class Access{
    // Creating a static method

    public void show01(){
        System.out.println("Hi this is not static method");
    }

    public static void show(){
        System.out.print("Hello this is static method");
        System.out.println(get_static);
    }

    // creating static variable

    int i;

    public static int get_static;
}
