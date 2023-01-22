import java.util.Scanner;

public class NewStudentRecord {

    public static void main(String[] args) {

        String str1;
        int Enrol,num;
        int sum = 0;
        
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter a Name : ");
        str1 = sc1.nextLine();

        Scanner sc2 =  new Scanner(System.in);
        System.out.println("Enter a Enroll : ");
        Enrol = sc2.nextInt();

        Scanner sc3 =  new Scanner(System.in);
        System.out.println("Enter a Subject no : ");
        num = sc3.nextInt();

        int an_Array[];
        an_Array = new int[10];

        for (int i = 0; i< num;i++)
        {
            
            Scanner sc4 =  new Scanner(System.in);
            System.out.println("Enter a Subject marks : ");
            an_Array[i] = sc4.nextInt();
            sum = an_Array[i] + i;
        }

        System.out.println(sum);

        double percent;

        percent = (sum /100) * 100;

        if (percent > 90)
        {
            System.out.println("A");
        }
        else if (percent < 90)
        {
            System.out.println("B");
        }
        else if (percent < 80)
        {
            System.out.println("C");
        }
        else if (percent < 70)
        {
            System.out.println("D");
        }

    }
}
