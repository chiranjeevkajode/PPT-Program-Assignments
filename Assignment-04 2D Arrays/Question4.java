
// Question 4
// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

import java.util.Arrays;

public class Question4 {
    private static int arrayPairsum(int[] nums){
        Arrays.sort(nums);
        int minSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            minSum += nums[i];
        }
        return minSum;
    }
    public static void main(String[] args) {
        System.out.println(arrayPairsum(new int[]{1,4,3,2}));
    }
}
