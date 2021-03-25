package leetcode;

/**
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 *
 * 示例：
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 输入: haystack = "aaaaaa", needle = "bba"
 * 输出: -1
 */
public class StrStr {
    /**
     * 子串逐一比较,使用substring方法
     * @param haystack
     * @param needle
     * @return
     */
/*    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for(int i = 0;i < h - n + 1;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }*/

    /**
     * 使用双指针
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        int ph = 0;

        if(n == 0){
            return 0;
        }
        while (ph < h - n + 1) {
            while (ph < h - n + 1 && haystack.charAt(ph) != needle.charAt(0)) {
                ph++;
            }
            int pn = 0;
            int curr_len = 0;
            while (ph < h && pn < n && haystack.charAt(ph) == needle.charAt(pn)) {
                ph++;
                pn++;
                curr_len++;
            }
            if (curr_len == n) {
                return ph - curr_len;
            }
            ph = ph - curr_len + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack = "aaaaaaaa";
        String needle = "bba";
        System.out.println(strStr(haystack,needle));
    }
}
