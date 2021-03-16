package leetcode;

import java.time.temporal.ValueRange;
import java.util.Arrays;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例：
 * 输入：[1,3,5,6], 5
 * 输出：2
 * 输入: [1,3,5,6], 2
 * 输出: 1
 */
public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if(target < nums[0]) return 0;
        if(target > nums[nums.length - 1]) return nums.length;
        while (left <= right){
            int mid = (left + right) / 2;
            if(target > nums[mid]){
                left = mid + 1;
            }
            if(target < nums[mid]){
                right = mid - 1;
            }
            if(target == nums[mid]) return mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int searchword = 4;
        System.out.println(searchInsert(arr,searchword));
    }


    /**
     * 二分法示例
     * 二分法查找适用于数据量较大时，但是数据需要先排好顺序。
     */
/*    public static int binarySearch(int[] arr,int value){
        int low = 0;
        int height = arr.length - 1;
        while (low <= height){
            int mid = (low + height) / 2;
            if(value == arr[mid]) return mid;
            if(value < arr[mid]){
                height = mid - 1;
            }
            if(value > arr[mid]){
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,8,12,32,98,56,63};
        int searchWord = 32;  // 所要查找的数
        Arrays.sort(arr);  //二分法查找之前，一定要对数组元素排序
        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord + "元素的索引" + binarySearch(arr, searchWord));
        System.out.println("========================");
        int errorWord = 99;
        System.out.println(errorWord + "错误的索引" + binarySearch(arr,errorWord));
    }*/
}
