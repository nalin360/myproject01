public class pattern_invert_r_tri {
    public static void main(String[] args) {
        // not success

        int num;
        num = 4;

        for (int i=1;i<=num;i++)
        {
            for (int j = 0;j<num;j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
