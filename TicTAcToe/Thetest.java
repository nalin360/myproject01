public class Thetest {

    public static void main(String[] args) {
/*
        boolean b;
        int weight=45;
        b=weight>50;
        System.out.println(b);
*/
        int var1 = 5;
        int var2 = 6;
        System.out.print(var1 > var2);
    }
    }

class MyParameterizedConstructor {
    private String name;

    public MyParameterizedConstructor(String str) {
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: " + str);
    }
}

