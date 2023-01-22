import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        /*
         factors of number
         example
         6 -> 1,2,3,6
         these are factors of 6
         if we divide 6 with any of this number we will
         get 0
        */

        int i, num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        for (i = 1;i<num;i++)
        {
            if (num % i == 0){
                System.out.print(i+" ");

            }
        }

    }
}
