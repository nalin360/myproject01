


    class ConsOver
{
    int area = 0;

    ConsOver(int len,int breth)
    {
        area = len * breth;
        System.out.println("Area of rectangale is " + area);
    }

    ConsOver(float len,float breth)
    {
        float area;
        area = len * breth;
        System.out.println("Area of rectangale is " + area);

    }

}

public class ConsOverload {
    public static void main(String[] args) {
        ConsOver obj1 = new ConsOver(10, 20);
        ConsOver obj2 = new ConsOver(1.0f, 2.0f);
    }
}