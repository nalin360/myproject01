import java.util.Scanner;

public class String_basic {
    public static void main(String[] args) {

        String s1,s2;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a string 1 : ");
        s1 = sc1.nextLine();
        System.out.print("Enter a string 2 : ");
        s2 = sc1.nextLine();



        // concatenate two string
        // another way ---> String s_out = s1 + s2;
        String s_out = s1.concat(" "+s2);
        System.out.println(s_out);

        // Length of two string

        int l1 = s1.length();
        int l2 = s2.length();

        System.out.println("the length of "+ "\"" + s1 + "\"" +" is " + l1  +" and length of "+"\""+ s2 +"\"" + " is " + l2);
        System.out.println("Total length is  " + (l1  + l2));

        // Converting String two Upper case

        System.out.println("**************************************************************");

        String u_s1 = s1.toUpperCase();
        String u_s2 = s2.toUpperCase();

        System.out.println("Strings in Upper case "+ u_s1 + " " + u_s2);

        System.out.println();

        System.out.println("***************************************************************");


        // converting string in lower case

        String l_s1 = s1.toLowerCase();
        String l_s2 = s2.toLowerCase();

        System.out.println("String in upper case " +l_s1+ " "+ l_s2);



    }

}
