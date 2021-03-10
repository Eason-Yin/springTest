package leetcode;

public class Reverse {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if(Math.abs(rev)>Integer.MAX_VALUE/10) return 0;
            int pop = x % 10;
            x = x / 10;

            int temp = rev * 10 + pop;
            rev = temp;
        }
        return rev;
    }

    public static void main(String[] args) {
        int result = reverse(2147483642);
        System.out.println(result);
    }
}
