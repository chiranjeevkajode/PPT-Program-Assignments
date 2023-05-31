
// Question 5
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

import java.util.Arrays;

public class Question5 {
    private static int maxProduct(int[] nums){
        Arrays.sort(nums);
        int opt1 = nums[0] * nums[1] * nums[nums.length -1];
        int opt2 = nums[nums.length -1] * nums[nums.length -2] * nums[nums.length -3];
        return Math.max(opt1, opt2);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {1,2,3}));
    }
}
