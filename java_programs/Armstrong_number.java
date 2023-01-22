import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        /*
         153 = 1 + 5 + 3
                1*1*1 + 5*5*5 + 3*3*3
                1    + 125 + 17
                153
        */

        int n;
        int temp;
        int sum=0,r;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        temp = n;

        while (n > 0)
        {
            r = n%10;
            sum = sum + r*r*r;
            n = n/10;
        }

        if (temp == sum)
            System.out.println("its Armstrong number ");
        else
            System.out.println("its not Armstrong number");
    }
}
