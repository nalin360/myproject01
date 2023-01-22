public class Block_Static {
    /*
    The advantage of private static methods is
     that they can be reused later if you need to
     reinitialize the class variable.
     */
    // ---> it is called before main
    // static variable
    static String s;
    // it should first initialize in static block than
    // it will get in main
    static {
        s = "Hello world";
        System.out.println("This is static block1");
    }
    public static void main(String[] args) {
        System.out.println("This is main and the \n value of s is :"+s);
    }
    static {
        System.out.println("This is static block2\n"+"*****************************\n");
    }
}
