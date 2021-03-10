package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumMatrix {
    /**
     *  哈希链表解决
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                int[] p = {map.get(target - nums[i]),i};
                return p;
                //return new int[] {map.get(target - nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
//    public static int[] twoSum(int[] nums, int target){
//        for(int i = 0;i < nums.length;i++){
//            for(int j = i + 1;j < nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) {
        int[] nums = {5,6,9,7,4,3,8};
        int[] solution = twoSum(nums,9);
        for(int x:solution){
            System.out.print(x + " ");
        }
    }
}

