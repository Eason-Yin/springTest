package leetcode;

public class Palindrome {
    public static boolean isPalindrome(int x){
        if(reverse(x) == x) {
            return true;
        }else if(x < 0 || x == 0){
            return false;
        }
        return false;
    }
    public static int reverse(int p) {
        int rev = 0;
        while (p != 0) {
            if(Math.abs(rev)>Integer.MAX_VALUE/10) return 0;
            int pop = p % 10;
            p = p / 10;

            int temp = rev * 10 + pop;
            rev = temp;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(5987895));
    }
}
