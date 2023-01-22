public class pattern_r_num {
    public static void main(String[] args) {

         /*
            1 2 3 4 5 6 7
        1   1
        2   2 2
        3   3 3 3
        4   4 4 4 4
        5   5 5 5 5 5
        6

          */
        for (int i=1;i<=3;i++)
        {
            for (int j = 1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
