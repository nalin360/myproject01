public class Super_key {
    public static void main(String[] args) {
        B_11 obj = new B_11(1);
    }
}

class A_11{ // super class
    public A_11(){
        System.out.println("This is A");
    }

    public A_11(int i){
        System.out.println("this is A with i ");
    }

}

class B_11 extends A_11{ // sub class

    public B_11(){
        System.out.println("This is B");
    }

    public B_11(int i){
        super(i);
        System.out.println("This is B with i");
    }

}