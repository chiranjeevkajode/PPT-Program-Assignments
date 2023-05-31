
// Question 6
// Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise,
// return -1.

// You must write an algorithm with O(log n) runtime complexity.

public class Question6 {
    private static int searchTarget(int[] nums, int target){
        int i = nums.length;
        int l = 0, h= i-1;
        int j = 0;

        while (l <= h) {
            j = l +(h -l) / 2;
            if (nums[j] == target) {
                return j;
            }
            if (target < nums[j]) {
                h = j - 1;
            }else{
                l = j + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchTarget(new int[]{-1,0,3,5,9,12}, 9));
    }
}
