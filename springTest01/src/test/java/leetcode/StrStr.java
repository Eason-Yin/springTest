package leetcode;

/**
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 *
 * 示例：
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 */
public class StrStr {
    /**
     * 子串逐一比较,使用substring方法
     * @param haystack
     * @param needle
     * @return
     */
//    public static int strStr(String haystack, String needle) {
//        int h = haystack.length();
//        int n = needle.length();
//        for(int i = 0;i < h - n + 1;i++){
//            if(haystack.substring(i,i+n).equals(needle)){
//                return i;
//            }
//        }
//        return -1;
//    }

    /**
     * 使用双指针
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        return -1;
    }


    public static void main(String[] args) {
        String haystack = "ieetcode";
        String needle = "co";
        System.out.println(strStr(haystack,needle));
    }
}
