public class final_key {
    public static void main(String[] args) {
        // final variable :

        final int i;
        i = 5;
        // A final variable can only be
        // initialized once, either via
        // an initializer or an assignment statement.
        System.out.println(i);
    }

}

class A02{

    final public void show(){
        System.out.println("this is A02");
    }
}

class B02 extends A02{
    // COMPILE-ERROR! Can't override.
    // to see the error remove bellow comments
    // from code 
   /*
    public void show(){
        System.out.println("This is B02");
    }

    */

}
