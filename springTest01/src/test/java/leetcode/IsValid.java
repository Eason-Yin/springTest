package leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 有效的括号   运用栈
 *
 */
public class IsValid {
    public static boolean isValid(String s){
        if(s.length() %2 != 0){
            return false;
        }
        Map<Character,Character> map = new HashMap<Character, Character>() {{
            put('}','{');
            put(')','(');
            put(']','[');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{([])}"));
    }
}
