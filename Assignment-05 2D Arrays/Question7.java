
// **Question 7**

// Suppose an array of length n sorted in ascending order is **rotated** between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// - [4,5,6,7,0,1,2] if it was rotated 4 times.
// - [0,1,2,4,5,6,7] if it was rotated 7 times.

// Notice that **rotating** an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of **unique** elements, return *the minimum element of this array*.

// You must write an algorithm that runs in O(log n) time.




public class Question7 {
    private static int sindMin(int[] nums){
        int n = nums.length;
        if(nums[0] <= nums[n -1]){
            return nums[0];
        }
        int left = 0, right = n - 1;

        while(left < right){
            int mid = (left + right) >> 1;
            if(nums[0] <= nums[mid]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(sindMin(new int[]{3,4,5,1,2}));
    }
}
