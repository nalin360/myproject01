import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {

        String nm;
        int ag;

        Human_ obj = new Human_();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your name : ");
        nm = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your age : ");
        ag = sc2.nextInt();


        obj.setName(nm);
        obj.setAge(ag);

        System.out.println("The name is " + obj.getName() + " and the age is " + obj.getAge());

    }
}
class Human_{

    private int Age;
    private String name;

    public void setAge(int Age_new){
        Age = Age_new;
    }

    public void setName(String name_new){
        name = name_new;
    }

    public int getAge(){
        return Age;
    }

    public String getName(){
        return name;
    }

}