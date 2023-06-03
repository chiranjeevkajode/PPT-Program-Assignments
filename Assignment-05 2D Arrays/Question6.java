
// **Question 6**

// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.



import java.util.ArrayList;
import java.util.List;

public class Question6 {
    private static List<Integer> findDuplicate(int[] nums){
        List<Integer> result = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0 ){
                result.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Question6 dups = new Question6();
        System.out.println(dups.findDuplicate(new int[]{4,3,2,7,8,2,3,1}));
    }
}
