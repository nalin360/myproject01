import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        int i,num;

        boolean prime = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new number : ");
        num = sc.nextInt();

        for (i = 2; i<=num/2; i++)
        {
            if (num%2 == 0)
            {
                prime = true;
                break;
            }
        }

        if (!prime)
            System.out.print(num + " is a prime number");
        else
            System.out.print(num +" is not a prime number");

    }
}
