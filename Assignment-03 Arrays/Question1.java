
// Question 1
// Given an integer array nums of length n and an integer target, find three integers
// in nums such that the sum is closest to the target.
// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.



import java.util.Arrays;

public class Question1 {
    private static int threeIntergerSum(int[] nums, int target){
        Arrays.sort(nums);

        int n = nums.length;
        int closest= nums[0] + nums[1] + nums[n -1];

        for (int i = 0; i < n -2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum <= target) {
                    j++;
                }else{
                    k--;
                }

                if (Math.abs(closest - target) > Math.abs(sum - target)) {
                    closest = sum;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        System.out.println(threeIntergerSum(new int[]{-1,2,1,-4}, 1));
    }
}
