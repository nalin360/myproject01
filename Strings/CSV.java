public class CSV {
    public static void main(String[] args) {
        /*
        String Spliting from CSV (comma seperated Values) in Java
         */
        String str = "Nalin , Sahani";

        String[] name = str.split(",");

        System.out.println(name[1]);

    }
}
