/**
 * Exercise 4 - Main04.Calculator (Time to Practice)
 */

class Main04 {

    public static void main(String[] args) {
        Calculator basic = new Calculator();
        basic.operate("+", 3);
        basic.operate("-", 1);
        basic.operate("*", 15);
        basic.operate("/", 3);

        Calculator advanced = new Calculator();
        advanced.firstValue(10); //Assign 10 to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("cos", 0); //Assign cos(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("sin", 1); //Assign sin(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("tan", 0); //Assign tan(0) to result
        advanced.operate("C"); //Reset result to 0
        advanced.operate("!", 5); //Assign the value of 5! to result (120)
        advanced.operate("C"); //Reset result to 0
        advanced.operate("e"); //Assign the value of "e" to result
        advanced.operate("+", 1.25);
        advanced.operate("+"); //Add the value of pi to result


        //Add at least 5 different operations and share your codeboard project in the forum.

    }

    public static class Calculator {
        Number result;

        public Calculator() {
            this.result = 0;
        }

        public void operate (String operator, Number num1) {
            //Make it better! Give a better solution for operate(String, Number)
            Number result = 0;
            switch (operator) {
                case "+": {
                    result = this.result.doubleValue() + num1.doubleValue();
                    break;
                }
                case "-": {
                    result = this.result.doubleValue() - num1.doubleValue();
                    break;
                }
                case "/": {
                    result = this.result.doubleValue() / num1.doubleValue();
                    break;
                }
                case "*": {
                    result = this.result.doubleValue() * num1.doubleValue();
                    break;
                }
                default: {
                    result = num1;
                }
            }
            System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
            this.result = result;
        }

        public void operate (String operator) {
            //Complete the missing implementation
            //this.result = newValue
        }

        public void firstValue(Number num1) {
            this.result = num1;
        }

    }
}
