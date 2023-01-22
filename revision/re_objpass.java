public class re_objpass {
    public static void main(String[] args) {

        // object passsing as parameter to a meathod

        ObjPass obj1 = new ObjPass(10 ,11);
        ObjPass obj2 = new ObjPass(10 ,11);


        System.out.println(""+obj1.equalTo(obj2));


    }
}

class ObjPass
{
    int i;
    int j;
    ObjPass(int a,int b)
    {
        i = a;
        j = b;
    }

    boolean equalTo(ObjPass o)
    {
        return (o.i == i && o.j == j);
    }
}
