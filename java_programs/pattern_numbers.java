public class pattern_numbers {
    public static void main(String[] args) {

        int num,i,j;
        num = 4;
        for (i=1;i<=num;i++)
        {
            for (j = 1;j<=num;j++) {
                int k = i + j - 1;
                if (k>num)
                System.out.print(k-num + " ");
                else
                    System.out.print(k + " ");
            }
            System.out.print("\n");
            // output
            /*
                1 2 3 4
                2 3 4 1
                3 4 1 2
                4 1 2 3
            * */
        }
    }
}
