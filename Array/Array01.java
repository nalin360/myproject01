import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        // making an array
        // creation , initialization , and accessing

        // -->creation
        int an_Array[];
        an_Array = new int[100];

        // combining above two statements
        // int[] an_Array = new int[5];

        //indexing
        // starts from 0 end with (last value - 1)
        //e.g an array of 5 so index are
        //0 1 2 3 4

        int num;

        Scanner as = new Scanner(System.in);
        System.out.print("Enter a number 100 or < 100 : ");
        num = as.nextInt();

        // Random r = new Random();
        // for random values

        //--> initialization
        /*
        old method
        an_Array[0] = 1;
         */
        for (int i = 0; i< num;i++)
        {
            an_Array[i] = i + 1;
        }

        //--> accessing
        /*
        for (int j=0;j<num;j++)
        {
            System.out.print(an_Array[j] + " ");
        }

         */
        // --->enhanced for loop
        // using enhanced for loop for fetching data from array
        // all the elements in the array will be fetched
        // unlike normal for loop where you can specify
        // number of item you want to fetch

        for(int j : an_Array)
        {
            System.out.print(j+",");
        }
    }
}
