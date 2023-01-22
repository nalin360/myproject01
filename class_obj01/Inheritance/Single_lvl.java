public class Single_lvl {
    public static void main(String[] args) {

        Single_B obj = new Single_B();
        // accessing Single_A class with Class Single_B
        obj.a = 10;
        obj.b = 9;

        obj.single_print_A();
        obj.single_B();

        System.out.println(obj.c);
        System.out.println();

    }

}

class Single_A{

    int a,b,c = 0;
    public void single_print_A(){
        System.out.println("This is A class");
        c = a+b;
    }

}

class Single_B extends Single_A{

    public void single_B(){
        System.out.println("This is B class");
        c = a -b;
    }


}
