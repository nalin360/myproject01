import java.util.*;

public class Wrapper {
    /*
    *
    * */
    public static void main(String[] args) {

        // BOXING

        int li = 5;

        Integer ii = new Integer(li);

        System.out.println(ii);

        // Autoboxing

        Integer jj = li;

        System.out.println(jj);

        int j = jj.intValue();//Unboxing
        int k = jj; // Auto Unboxing

        // Collections
        ArrayList<Integer> values = new ArrayList<Integer>();

        values.add(li);

    }
}
