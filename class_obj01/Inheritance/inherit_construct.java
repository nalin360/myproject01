public class inherit_construct {
    //Inheritance and constructors in Java <---

    //In Java, constructor of base class
    // with no argument gets automatically
    // called in derived class constructor.

    public static void main(String[] args) {
        Bb obj = new Bb();
    }
}

class Aa{
    Aa(){
        System.out.println("This is Aa constructors");
    }
}

class Bb extends Aa{
    Bb(){
        System.out.println("This is Bb constructors");
    }
}