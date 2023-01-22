import java.util.Scanner;

public class NewClassswitch {

    public static void main(String[] args) {

        String c;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the character for cube - c , " +
                "Square - sq ,"
                + " factorial - f"
                + " sum  - s , Subtraction - su"
                + "Multiplication - m"
                + "Minimum - min" +
                "Maximum - m");
        c = sc1.nextLine();


        do {
            switch (c) {
                case "c":
                    double B;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter the cube :");
                    double a = scanner1.nextDouble();
                    B = a * a;
                    System.out.println("cube = " + B);

                    break;

                case "sq":
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter the length of square:");
                    double s = scanner2.nextDouble();
                    double areas = s * s;
                    System.out.println("Area of square is:" + areas);
                    break;

                case "f":
                    int fact;
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.println("Enter the number :");
                    int number  = scanner7.nextInt();
                    fact = Fact.factorial(number);
                    System.out.println("Factorial of "+number+" is: "+fact);
                    break;

                case "s":
                    int c1;
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Enter the a :");
                    double aa = scanner3.nextDouble();
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Enter the b :");
                    double bb = scanner4.nextDouble();
                    c1 = Sumfuc.sum(aa,bb);
                    System.out.println("sum of a&b is" + c1);
                    break;

                case "su":

                    double c3;
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Enter the a :");
                    double aa1 = scanner5.nextDouble();
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Enter the b :");
                    double bb1 = scanner6.nextDouble();
                    c3 = Subfuc.sub(aa1,bb1);
                    System.out.println("Subtraction of a&b is" + c3);
                    break;

                case "m":
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("Enter the a :");
                    double aa2 = scanner8.nextDouble();
                    Scanner scanner9 = new Scanner(System.in);
                    System.out.println("Enter the b :");
                    double bb2 = scanner9.nextDouble();
                    double c4 = (aa2 * bb2);
                    System.out.println("Multiplication of a&b is" + c4);
                    break;

                case "min":
                    Scanner scanner10 = new Scanner(System.in);
                    System.out.println("Enter the a :");
                    double aaa1 = scanner10.nextDouble();
                    Scanner scanner11 = new Scanner(System.in);
                    System.out.println("Enter the b :");
                    double bbb1 = scanner11.nextDouble();
                    if(aaa1 > bbb1)
                    {
                        System.out.println("The b is  Minimum than a" + aaa1);
                    }
                    else
                    {
                        System.out.println("The a is Minimum number " + bbb1);
                    }
                    break;

                case "max":
                    Scanner scanner12 = new Scanner(System.in);
                    System.out.println("Enter the a :");
                    double aaa2 = scanner12.nextDouble();
                    Scanner scanner13 = new Scanner(System.in);
                    System.out.println("Enter the b :");
                    double bbb2 = scanner13.nextDouble();
                    if(aaa2 < bbb2)
                    {
                        System.out.println("The a is maimum number than a" + aaa2);
                    }
                    else
                    {
                        System.out.println("The b is maximum number " + bbb2);
                    }
                    break;


            }
        } while (c == "c" || c == "min" || c == "sq"||c == "max"||c == "su"||c == "m" || c == "f");

    }
}
class Sumfuc {
    static int sum(double x, double y) {
        double z;
        z =  (x + y);
        return (int) z;
    }
}
class Subfuc {
    static int sub(double x, double y) {
        double z;
        z =  (x - y);
        return (int) z;
    }
}

class Fact {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}