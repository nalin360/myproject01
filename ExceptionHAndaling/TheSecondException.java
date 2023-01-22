public class TheSecondException {
    public static void main(String[] args) {

        int i, j, k = 0;
        int a[] = new int[4];

        i = 8;
        j = 2;

        try
        {
            k = i / j;

            for (int c = 0; c<=4; c++)
            {
                a[c] = c +1;
            }

            for(int values : a)
            {
                System.out.println(values);
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(k);
    }
}
