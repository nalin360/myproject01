import java.util.Calendar;
import java.util.Date;

class Main03 {

    private static String Austrian;

    public static void main(String[] args) {
        //Date(int year, int month, int date)
        Date birthDate = new Date(1987, Calendar.FEBRUARY,22); //Remember to subtract 1 to the month
        Date expirationDate = new Date(2017, 1,13);
        long id = 1287564540101L;
        Passport myPassport = new Passport(id, "Conny", "Smith", Austrian, birthDate, expirationDate, 'F');
        boolean passportExpired = myPassport.isExpired();

        if (passportExpired) {
            System.out.println("You need to renew your passport");
        } else {
            System.out.println("Your passport is still valid");
        }
    }

    public static void setAustrian(String austrian) {
        Austrian = austrian;
    }
}
