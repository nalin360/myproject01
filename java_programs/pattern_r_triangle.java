public class pattern_r_triangle {
    public static void main(String[] args) {
        /*
        for (int i=0;i<3;i++)
        {
            for (int j = 0;j<3;j++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
        // output

        * * *
        * * *
        * * *

         */

        for (int i=1;i<=3;i++)
        {
            for (int j = 0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        /*
        // output
         *
         * *
         * * *

         * */
    }
}
