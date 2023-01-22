public class array2D {
    public static void main(String[] args) {

        //int [][] an_Array = new int[4][4];

        int[][] an_Array = {
                {1,2,3},
                {9,4,5},
                {6,7,8}
                };
/*
        for (int i=0;i<3;i++)
        {
            for (int j =0;j<3;j++)
            {
                System.out.print(an_Array[i][j] + " ");
            }
            System.out.println();
       }

 */
        // enhanced for loop
        // fetching jagged array is also possible
        // ---> jagged array
        //int[][] an_Array = {
        //                {1,2,3,4},
        //                {9,4,},
        //                {6,7,8}
        //                };


        for (int[] i :an_Array)
        {
            for (int j : i) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }
}
