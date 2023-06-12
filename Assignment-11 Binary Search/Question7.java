
//  **Question 7**

// Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

// If `target` is not found in the array, return `[-1, -1]`.

// You must write an algorithm with `O(log n)` runtime complexity.


import java.util.Arrays;

public class Question7 {
     private static int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target + 1);
        return l == r ? new int[] {-1, -1} : new int[] {l, r - 1};
    }

    private static int search(int[] nums, int x) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
