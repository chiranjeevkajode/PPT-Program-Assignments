
//  **Question 4**

// Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.



public class Question4 {
    private static int findMaxLength(int[] nums) {
        int maxlen = 0;
        for (int start = 0; start < nums.length; start++) {
          int zeroes = 0, ones = 0;
          for (int end = start; end < nums.length; end++) {
            if (nums[end] == 0) {
              zeroes++;
            } else {
              ones++;
            }
            if (zeroes == ones) {
              maxlen = Math.max(maxlen, end - start + 1);
            }
          }
        }
        return maxlen;
      }
      public static void main(String[] args) {
            System.out.println(findMaxLength(new int[]{0,1}));
      }
}
