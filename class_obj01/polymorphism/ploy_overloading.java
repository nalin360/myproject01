public class ploy_overloading {
    public static void main(String[] args) {
        /* When there are multiple functions with same
        name but different parameters then these
         functions are said to be overloaded.
         */

        //--->Functions can be overloaded by change
        // in number of arguments or/and change
        // in type of arguments.

        ploy_A obj = new ploy_A();
        obj.show();
        obj.show(4);

    }
}

class ploy_A{

    public void show(){
        System.out.println("Hello");
    }

    public void show(int i){
        System.out.println("hello" + i);
    }

}


