import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
         /*
           fibonacci series
           1 1 2 3 5 8 13 ...n

          */
        int i,k,j,n;
        i=1;
        j=1;
        k=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        System.out.print("1 1 ");

        while (k<n)
        {
            k = i + j;
            System.out.print(k + " ");
            i = j;
            j = k;
        }

    }
}
