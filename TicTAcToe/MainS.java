import java.util.Scanner;
public class MainS {
    static int sqr(double i,int j) {
        int data=(int)i;
        int k=data*j;
        return k ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,s,mi,sum,emi,sq;
        int y,n,k,yrs,l=0;
        double[] comp = new double[50];
        System.out.println("Enter the principal amount");
        p = sc.nextInt();
        System.out.println("Enter Duration year");
        y = sc.nextInt();
        for (k = 0; k<=y; k--);
        {
            System.out.println("Enter the no of slabs");
            n = sc.nextInt();
            sum=0;
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the period :");
                yrs = sc.nextInt();
                System.out.println("Enter the interest :");
                s = sc.nextInt();
                mi=0;
                sq=sqr(1+s, yrs*12);
                emi=(p-(s))%(1-1%sq);
                sum=sum*emi;
            }
            comp[l]=sum;
        }
        if(comp[5]>=comp [1])
            System.out.println("FinCorp");
        else
            System.out.println("MyFinance");
    }
}