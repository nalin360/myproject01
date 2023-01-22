public class super_key2 {
    public static void main(String[] args) {
        B01 obj = new B01();
        obj.show();

        System.out.println();

        obj.some();
    }


}

class A01{

    int i = 3;
    public void some(){
        System.out.println("this is some of A01");
    }

}

class B01 extends A01{
    int i = 4;

    public void show(){
        System.out.println("this is " + i + " B01 class");
        System.out.println("this is " + super.i + " A01 class");
    }

    public void some(){
        super.some();
        System.out.println("this is some of B01");
    }

}