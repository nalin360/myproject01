import java.util.Scanner;

public class prime_interval {
    public static void main(String[] args) {

        int low, high;

        Scanner ls = new Scanner(System.in);
        System.out.print("Enter a starting number : ");
        low = ls.nextInt();


        Scanner hs = new Scanner(System.in);
        System.out.print("Enter a end number : ");
        high = hs.nextInt();

        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // condition for non prime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1) {
                System.out.print(low + " ");
            }
            ++low;
        }
    }
}

