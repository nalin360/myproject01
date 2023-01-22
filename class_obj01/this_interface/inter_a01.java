interface AB01{
    void show();
}



class A01_impl implements AB01{
    public void show()
    {
        System.out.println("this is show");
    }
}


public class inter_a01 {
    public static void main(String[] args) {
        AB01 obj = new A01_impl();
        obj.show();
    }

}
