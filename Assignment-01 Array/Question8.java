
// **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

import java.util.Arrays;

public class Question8 {
    public static int[] findWrongNumber(int[] nums){
        int i = nums.length;
        int sum = i * (i + 1) / 2;
        int[] result = new int[2];
        boolean[] j = new boolean[i + 1];

        for(int num : nums){
            sum -= num;
            if(j[num]) result[0] = num;
            j[num] = true;
        }

        result[1] = sum + result[0];
        return result;
    } 

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findWrongNumber(nums);
        System.out.println(Arrays.toString(ans));
    }
}
