public class palindrome {
    public static void main(String[] args) {
        /*
        let n is a number
        for example that is 121
        than we have to -> reverse <- or 121
        we will store reverse number in x
        than we have to compare 'n' and 'x'
        if n and x are equal
        than it is a palindrome number

         */

        int x,r,sum,num;

        sum = 0;
        num = 121;
        r = num;
        int i;
        i = Integer.parseInt(args[0]);

        while (num > 0) {
            x = num % 10;
            sum = (sum * 10) + x;
            num = num / 10;
        }

        System.out.println(" reverse is : " + sum);

        if (r == sum)
            System.out.println(" yes palindrome");
        else
            System.out.println(" No palindrome");

    }
}
