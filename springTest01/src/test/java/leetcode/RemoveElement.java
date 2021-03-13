package leetcode;

/**
 * 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        for(int q = 0;q < nums.length;q++){
            if(nums[q] != val){
                nums[p] = nums[q];
                p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int re = removeElement(nums,3);
        for(int i = 0;i < re;i++){
            System.out.print(nums[i]);
        }
    }
}
