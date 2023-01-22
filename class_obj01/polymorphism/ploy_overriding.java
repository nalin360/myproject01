public class ploy_overriding {
    public static void main(String[] args) {
        // ploy_over_ridA obj = new ploy_over_ridA();
        ploy_rideB obj = new ploy_rideB();
        obj.show();
    }
}

class ploy_over_ridA{

    public void show(){
        System.out.println("This is A class show");
    }
}

class ploy_rideB extends ploy_over_ridA{

    public void show(){
        System.out.println("this is B");
    }
}