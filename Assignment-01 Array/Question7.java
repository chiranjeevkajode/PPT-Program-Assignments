
// **Q7.**Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.



public class Question7 {
    private static void moveZero(int[] nums){
        int len = nums.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < len) {
            nums[count++] = 0;
        }

        for (int j = 0; j < len; j++) {
            System.out.print(nums[j] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZero(nums); 
    }
}
