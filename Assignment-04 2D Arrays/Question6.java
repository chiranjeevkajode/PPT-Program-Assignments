
// Question 6
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.Arrays;

public class Question6 {
    private static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for(int i = 0; i < A.length; i++){
            res[i] = A[i] * A[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
}
