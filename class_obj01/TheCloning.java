

public class TheCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
        * Shallow Copy
        * Deep copy
        * Cloning
        * */

        AClone obj1 = new AClone();
        obj1.i = 10;
        obj1.j = 12;

        AClone obj2 = (AClone) obj1.clone();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class AClone implements Cloneable
{
    
    int i;
    int j;

    @Override
    public String toString() {
        return "AClone{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public Object clone()    throws CloneNotSupportedException
    {
        return super.clone();
    }
}