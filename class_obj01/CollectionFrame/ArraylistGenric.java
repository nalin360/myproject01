import java.util.ArrayList;

public class ArraylistGenric {

    public static void main(String[] args) {
        // collection functions
        ArrayList<Integer> arr1 =  new ArrayList<>();

        /*-- to add function to add elements */
        arr1.add(4);
        arr1.add(5);

        //System.out.println(arr1);
        /*----------*/

        ArrayList<Integer> arr2 =  new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        /*----*/
        arr2.addAll(3,arr1);
        System.out.println(arr2);// (addAll) add all elements of arr1 to arr2

        /*--------------*/
        ArrayList<Integer> arr3 =  new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);

        int n =4;
        if (arr1.contains(n))// contains return boolean value
        {
            System.out.println( n + " following element is in the arr1 ");
        }

        if (arr2.containsAll(arr1)) // containsAll return boolean value
        {
            System.out.println( arr1 + " collection contains all of the elements in the specified collection. ");
        }

        if (arr2.equals(arr3)) // equals return boolean value
        {
            System.out.println( arr3 + " Compares the specified object with this collection for equality. ");
        }
        //System.out.println(arr2.equals(arr3));
    }
}
