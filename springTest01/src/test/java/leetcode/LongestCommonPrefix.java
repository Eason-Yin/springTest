package leetcode;
//最长公共前缀
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"strkeg","strkieuhrg"};
        System.out.println(longestCommonPrefix(str));
    }

    /**
     * 横向扫描
     * @param str
     * @return
     */
//    public static String longestCommonPrefix(String[] str){
//        if(str == null || str.length == 0){
//            System.out.println("字符串为空！");
//        }
//        String prefix = str[0];
//        for (int i = 1;i < str.length;i++){
//            prefix = longestCommonPrefix(prefix,str[i]);
//            if(prefix.length() == 0){
//                System.out.println("没有相同的字符！");
//                break;
//            }
//        }
//        return  prefix;
//    }
//    public static String longestCommonPrefix(String str1,String str2){
//        int length = Math.min(str1.length(),str2.length());
//        int index = 0;
//        while (index < length && str1.charAt(index) == str2.charAt(index)){
//            index++;
//        }
//        return str1.substring(0,index);
//    }

    /**
     * 纵向扫描
     * @param str
     * @return
     */
    public static String longestCommonPrefix(String[] str){
    if(str == null || str.length == 0){
        System.out.println("字符串为空！");
    }

    int length = str[0].length();
    int count = str.length;
    for(int i = 0;i < length;i++){
        char c = str[0].charAt(i);
        for(int j = 1;j < count;j++){
            if(i == str[j].length() || str[j].charAt(i) != c){
                return str[0].substring(0,i);
            }
        }
    }
    return str[0];
}


}
