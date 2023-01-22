import java.io.InputStreamReader;
import java.util.Scanner;

public class TheThirdException {

    public static void main(String[] args) {

        int i, j, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        j = sc.nextInt();
        i = 8;


        try
        {
            k = i / j;

        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(k);
    }
}
