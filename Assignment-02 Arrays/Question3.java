
// Question 3
// We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence
// among all its possible subsequences.

// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

import java.util.Arrays;

public class Question3 {
    private static int harmoniusArray(int[] nums){
        int val = nums.length;
        int left = 0;
        int result = 0;

        Arrays.sort(nums);

        for (int i = 0; i <val; i++) {
            while (left < i && nums[i] - nums[left] > 1L) {
                left++;
            }

            if (nums[i] - nums[left] == 1L) {
                result = Math.max(i - left + 1, result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(harmoniusArray(new int[] {1,3,2,2,5,2,3,7}));
    }
}
