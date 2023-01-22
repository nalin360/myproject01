public class String_to {
    public static void main(String[] args) {
        student obj = new student(1,"Nalin");

        //System.out.println(obj);
        //^--> output ---> student@e580929

        System.out.println(obj);
    }

}

class student{

    int roll_number;
    String name;

    student(int roll_number,String name){
        this.roll_number = roll_number;
        this.name = name;
    }

    public String toString(){
        return "Student roll number : " + roll_number + " and name " + name;
    }

}
