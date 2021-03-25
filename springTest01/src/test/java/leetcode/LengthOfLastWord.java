package leetcode;

/**
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * 示例：
 * 输入：s = "Hello World"
 * 输出：5
 *
 * 输入：s = " "
 * 输出：0
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "hello worldawd ";
        System.out.println(lengthOfLastWord(s));
    }

    /**
     * 从后往前遍历
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        int count = 0;
        if(s.length() == 0 || s == null) return 0;
        for (int i = s.length() - 1;i >= 0;i--){
            if(s.charAt(i) == ' '){
                if (count == 0) continue;
                break;
            }
            count++;
        }
        return count;
    }
}
