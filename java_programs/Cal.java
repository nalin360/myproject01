import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {

        int a,b;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        a = sc1.nextInt();
        System.out.println("Enter a number 2:");
        b = sc1.nextInt();
        String c;


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter operation + - * /:");
        c = sc2.nextLine();


        switch (c) {
            case "+":
                System.out.println("Addition" + (a+b));
                break;
            case "-":
                System.out.println("Substraction" + (a-b));
                break;
            case "*":
                System.out.println("Multiplication" + (a*b));
                break;
            case "/":
                System.out.println("Division" + (a/b));
                break;
            default:
                System.out.println("Worng Input");
        }

    }
}
