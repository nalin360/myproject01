/*
* Unary operator
* +,-
* ++,--
* !
* */

public class unary_operator {
    public static void main(String[] args) {
        int val1=1;
        int val2=2;

        int result = val1 + val2;
        System.out.println(result);

        result++;

        System.out.println(result);

        result--;

        System.out.println("result-- = "+result);

        int j = ++result;
        System.out.println(""+ j);
        j = --result;
        System.out.println(j);


        //boolean value

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

    }
}
