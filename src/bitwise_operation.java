/*
* bitwise operation
* & , ^ , | , >> , <<
*
* */
public class bitwise_operation {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;

        int ans,ans1,ans2;
        ans = a & b;
        System.out.println(
                "bitwise AND (&): "+ans);
        ans1 = a ^ b;
        System.out.println("bitwise XOR (^):"+ans1);
        ans2 = a | b;
        System.out.println("bitwise OR (|):"+ans2);

        // left shift << and right shift >>

        int shift,shift1;
        shift = a << 2;
        System.out.println("left shift :"+shift);
        shift1 = a >> 2;
        System.out.println("Right shift :"+shift1);
    }
}
