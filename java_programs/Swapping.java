public class Swapping {
    public static void main(String[] args) {

        // swapping method 1
/*
        int a,b,temp;
        a=4;
        b=5;

        temp = a;
        a=b;
        b=a;

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

 */
        // Swapping method 2
/*
        int a,b,temp;
        a=4;
        b=5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

 */

        // Swapping method 3 xor
/*
        int a,b,temp;
        a=4;
        b=5;

        a = a ^ b;//1 0 1 XOR 1 0 0 ----> 0 0 1
        b = a ^ b;//0 0 1 XOR 1 0 0 ----> 1 0 1 -> 5
        a = a ^ b;//0 0 1 XOR 1 0 1 ----> 1 0 0 -> 4

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

 */

        // Swapping method

        int a,b;
        a=4;
        b=5;

        b = a+b-(a=b);

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

    }

}
