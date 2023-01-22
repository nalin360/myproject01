public class re_arrays1d {
    public static void main(String[] args) {
        int as_Array[];
        as_Array = new int[10];

        for(int i = 0; i < 10;i++)
        {
            as_Array[i] = i + 1;
        }
/*
        for (int i = 1; i < 10; i++)
        {
            System.out.println(as_Array[i]);
        }

 */
        for (int j : as_Array)
        {
            System.out.println(j);
        }
    }
}
