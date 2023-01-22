
public class class01 {
    public static void main(String[] args) {

        hello welcome = new hello();

        welcome.text();
    }
}

// making of class , objects constructor

class hello{

    // constructor
    public hello(){
        System.out.println("Default constructor");
    }

    // this is a method
    public void text(){
        System.out.println("hello world");
    }

}