public class multilevel_inherit {
    public static void main(String[] args) {

        add_sub_mul obj = new add_sub_mul();
        obj.num1 = 10;
        obj.num2 = 20;
        obj.num3 = 0;
        obj.sum(obj.num1, obj.num2);
        obj.sub(obj.num1, obj.num2);
        obj.mul(obj.num1, obj.num2);
        System.out.println( "Done");
    }
}
// parent ,super , base
class add{
    int num1,num2,num3;
    public void sum(int num1,int num2){
        num3 = num1 + num2;
        System.out.println(num3);
    }

}
//child, sub, derived
class add_sub extends add{

    public void sub(int num1,int num2){
        num3 = num1 - num2;
        System.out.println(num3);
    }
}

class add_sub_mul extends add_sub{

    public void mul(int num1,int num2){
        num3 = num1 * num2;
        System.out.println(num3);
    }
}
