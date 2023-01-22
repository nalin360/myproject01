public class Abs_ {
    public static void main(String[] args) {
        Mesh_phone obj = new Suresh_phone(); // cannot instantiate the abstract class

        obj.call();
        obj.move();
        obj.dance();
        obj.cook();
    }

}

abstract class Mesh_phone {

    public void call(){
        System.out.println("Calling...");
    }

    public abstract void move(); // Abstract method
    public abstract void dance();
    public abstract void cook();


}

abstract class Ramesh_phone extends Mesh_phone{

    public void move(){
        System.out.println("Move....");
    }
}

class Suresh_phone extends Ramesh_phone
{
    public void dance(){
        System.out.println("Dancing");
    }

    public void cook(){
        System.out.println("cooking...");
    }

}