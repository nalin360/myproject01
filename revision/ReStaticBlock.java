public class ReStaticBlock {
    /*
    * Static Block
    *always called first when the class
    * is loaded into jvm even before main
    * method
    * */

    static {
        String s = "Hello World 1";
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("Hello World 2");
    }

}
