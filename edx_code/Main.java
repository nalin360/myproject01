/**
 * Exercise 5 - Main.TimeHelper (Train your coding skills)
 */

public class Main {

    public static void main(String[] args) {
        TimeHelper th1 = new TimeHelper(37000);
        System.out.println(th1.inMinutes());     // should print: 61
        System.out.println(th1.inHours());       // should print: 1
        System.out.println(th1.toString());      // should print: 1 hour 1 minute 40 seconds

        TimeHelper th2 = new TimeHelper(7320);
        System.out.println(th2.inMinutes());     // should print: 122
        System.out.println(th2.inHours());       // should print: 2
        System.out.println(th2.toString());      // should print: 2 hours 2 minutes 0 seconds
    }

    public static class TimeHelper {
        public int seconds;

        public TimeHelper (int s) {
            seconds = s;
        }

        public int inMinutes () {
            return seconds / 60;
        }

        public int inHours () {
            return seconds / 3600;
        }

        public String toString () {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int remSeconds = seconds % 60;

            return hours + (hours == 1 ? " hour " : " hours ") + minutes + (minutes == 1 ? " minute " : " minutes ") + remSeconds + (remSeconds == 1 ? " second " : " seconds ");

            /*
                We can use some conditionals to check the value of hours, minutes and remSeconds.
                We can also use the ternary operator, mentioned in the control flow videos, to simplify the code.

                Remember the syntax:
                (condition ? consequent : alternative)
                    condition - must evaluate to boolean
                    consequent - value to return if the condition is true
                    alternative - value to return if the condition is false
            */
        }
    }
}
