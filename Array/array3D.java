public class array3D {
    public static void main(String[] args) {

        int [][][] an_Array = new int[3][3][3];
        //int[][][] an_Array = {};

        for (int i = 0; i<an_Array.length;i++)
        {
            for (int j = 0; j<an_Array.length;j++)
            {
                for (int k = 0;k<an_Array.length;k++)
                {
                    an_Array[i][j][k] = i+j+k;
                }
            }
        }

        // fetching the value by normal for loop
/*
        for (int i = 0; i<an_Array.length;i++)
        {
            for (int j = 0; j<an_Array.length;j++)
            {
                for (int k = 0;k<an_Array.length;k++)
                {
                    System.out.print(an_Array[i][j][k] + " ");
                }
                System.out.println();
            }
        }

 */
        // enhanced for loop

        for (int[][] i : an_Array) {
            for (int[] j : i ) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }
}
