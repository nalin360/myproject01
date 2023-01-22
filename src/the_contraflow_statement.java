/*
* practicing control_flow statement
* ->decision making statement
* if
* if else
* then
*
* 
* */
// checking odd and even number
public class the_contraflow_statement {
    public static void main(String[] args) {
       /* int a;
        a = 5;

        if(a%2==0)
        {
         System.out.print("The number is even ");
        }
        else {
            System.out.print("The number is odd");
        }
        */
        // finding the biggest number among three
        int a,b,c;
        a=1;
        b=8;
        c=60;
        if(a>b && a>c){
            System.out.println("The biggest number is "+a);
        }
        else if(b>c){
            System.out.println("The biggest number is "+b);
        }
        else {
            System.out.println("The biggest number is "+c);
        }
    }
}
