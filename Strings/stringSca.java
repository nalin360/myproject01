import java.util.Scanner;

public class stringSca {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = input.nextLine();
        System.out.println("My name is : " + name);

        input.close();
    }
}
