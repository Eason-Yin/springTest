package leetcode;

/**
 * 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 示例：
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "101";
        String b = "1001";
        System.out.println(addBinary(a,b));
    }

    /**
     *  简单方法   将 a 和 b 转化成十进制数，求和后再转化为二进制数
     * @param a
     * @param b
     * @return
     */
/*    public static String addBinary(String a,String b){
        //Integer.toBinaryString()以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }*/

    /**
     * 末尾对齐，逐位相加
     * 在十进制的计算中「逢十进一」，二进制中我们需要「逢二进一」
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a,String b){
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(),b.length());
        int carry = 0;
        for(int i = 0;i < n;i++){
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if(carry > 0){
            ans.append('i');
        }
        ans.reverse();

        return ans.toString();
    }

}
