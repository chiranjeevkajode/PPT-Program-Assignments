
// Question 7
// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

public class Question7 {
    private static boolean monotonicInteger(int[] nums){
        boolean isincrement = true;
        boolean isdecrement = true;
        int a = nums.length;

        for (int i = 0; i < a - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isincrement = false;
            }
            if (nums[i] < nums[i + 1]) {
                isdecrement = false;
            }
        }

        return isincrement || isdecrement;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        boolean ans = monotonicInteger(arr);
        System.out.println(ans);
    }
}
