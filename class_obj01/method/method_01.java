public class method_01 {
    public static void main(String[] args) {

        calculator calculate = new calculator();

        int x = calculate.add(1,2);
        System.out.print(x);
    }
}

class calculator{

    public int add(int a,int b){
        int sum;
        sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b){
        int sub;

        sub = a - b;
        return sub;
    }
    public int multiplication(int a,int b){
        int mul;

        mul = a * b;
        return mul;
    }

    public int division(int a,int b){
        int div;

        div = a / b;

        return div;
    }


}
