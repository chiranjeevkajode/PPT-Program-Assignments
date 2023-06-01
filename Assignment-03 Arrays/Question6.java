
// Question 6
// Given a non-empty array of integers nums, every element appears twice except
// for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only
// constant extra space.

public class Question6 {
    private static int singleNumber(int[] nums){
        int ans = 0;

        for(int i = 0; i <nums.length;i++){
            ans = nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
}
