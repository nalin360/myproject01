class A{
    // How to count number of object

    static int i;
    A(){
        i++;
    }

    public void counter(){
        System.out.println(i);
    }
}

public class count_obj {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();

        //obj2.counter();
        obj3.counter();
    }
}
