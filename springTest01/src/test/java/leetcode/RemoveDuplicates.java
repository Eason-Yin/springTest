package leetcode;

/**
 * 删除排序数组中的重复项  双指针法
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                if(q - p > 1){
                    nums[p + 1] = nums[q];
                }
                p++;
            }
            q++;
        }
        return p + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5};
        int re = removeDuplicates(nums);
        for(int i = 0;i < re;i++){
            System.out.print(nums[i]);
        }
       // System.out.println(removeDuplicates(nums));
    }
}
