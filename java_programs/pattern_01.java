public class pattern_01 {
    public static void main(String[] args) {

        /*
            1 2 3 4 5 6 7
        1   1
        2   0 1
        3   1 0 1
        4   0 1 0 1
        5   1 0 1 0 1
        6

        logic
        if we add column 1 and row 1 we get (1 + 1) 2 that is -> even
        if we add column 1 and row 2 we get (1 + 2) 3 that is -> odd
        so for even print 1
        and for odd print 0
        */

        int i,j,num;
        num = 5;

        for (i=1;i<=num;i++)
        {
            for (j = 0;j<i;j++) {
                if ((i+j) % 2 == 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println(" ");
        }
    }
}
