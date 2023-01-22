public class method_02 {
    public static void main(String[] args) {

        method_02 obj = new method_02();
        System.out.println("the addition is "+obj.add(5,7));
        System.out.print("the addition is "+obj.add_args(5,4,5,6,7));


    }

    public int add(int value_1,int value_2){

        return value_1 + value_2;
    }

    // if we don't know number of arguments so

    public int add_args(int...val){
        int sum = 0;
        for (int i :val) {
            sum += i;
        }
        return  sum;
    }


}
