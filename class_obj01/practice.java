import java.util.Date;

/**
 * Main class of the Java program.
 */

class Main01 {

    public static void main(String[] args) {
        Human connie = new Human("Connie", "Smith", 'F');

        connie.setBirthDate(1987,1,22); //January 22th, 1987
        System.out.println(connie.getFullName() + " is "+ connie.getAge() + " years old");

        Human john = new Human("John", "Brown", 'M');
        john.setBirthDate(1986,12,8);//December 08th, 1986
        System.out.println(john.getFullName() + " is "+ john.getAge() + " years old");
        connie.addPartner(john);
        System.out.println(connie.getFullName() + "'s partner is " +  connie.getPartnerName());
        System.out.println(john.getFullName() + "'s partner is " +  john.getPartnerName());
    }
}

class Human{
    char gender; // 'F' or 'M'
    String firstNames, lastName;
    Human partner;
    int identificationNumber;
    int yearBirth;
    int monthBirth;
    int dayBirth;

    public Human(String firstNames, String lastName, char gender){
        this.firstNames = firstNames;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void speak(String words){
        System.out.println(words);
    }

    public void addPartner(Human humanCouple){
        this.partner = humanCouple;
        humanCouple.partner = this;
    }

    public Human getPartner(){
        return this.partner;
    }

    public void setId(int id){
        identificationNumber = id;
    }

    public int getId(){
        return identificationNumber;
    }

    public void setBirthDate(int yearBirth, int monthBirth, int dayBirth){
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
    }

    public int getAge(){
        Date today = new Date();

        //the current year represented by this date, minus 1900
        int currentYear = today.getYear() + 1900;
        int age = currentYear - yearBirth;

        //0 is January, so add 1
        int currentMonth = today.getMonth() + 1;
        if(currentMonth < monthBirth){
            age--;
        }else if(currentMonth == monthBirth){
            //day of the Month
            int currentDay = today.getDate();
            if(dayBirth > currentDay){
                age--;
            }
        }
        return age;
    }

    public String getPartnerName(){
        return this.partner.getFullName();
    }

    public String getFullName(){
        return this.firstNames + " " + this.lastName;
    }

}