import java.sql.SQLOutput;
import java.util.Scanner;

public class TheFiveException {
    public static void main(String[] args) {
        // try with resources
        try(  Scanner sc1 = new Scanner(System.in);) {

            String sr;
            System.out.println("Enter number: ");
            sr = sc1.nextLine();
        }



    }
}
