package leetcode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例：
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 *
 * 输入：nums = [1]
 * 输出：0
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    /**
     * 无名方法
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums){
        int ans = nums[0];
        int sum = 0;
        for(int x:nums){
            if(sum > 0){
                sum += x;
            }else{
                sum = x;
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }

    /**
     * 分治法
     * @param nums
     * @return
     */
/*    public static int maxSubArray(int[] nums){

    }*/
}
