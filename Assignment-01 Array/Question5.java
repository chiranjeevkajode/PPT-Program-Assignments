

// **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

import java.util.Arrays;

public class Question5 {
    static void mergeNumbers(int[] nums1 , int m , int[] nums2 , int n)
    {
        for(int i = 0 ; i < n ; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);
    }
    public static void main(String args[])
    {
        int m = 3 , n = 3;
        int[]nums1 = new int[m + n];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        int[] nums2 = {2 , 5 , 6};
        mergeNumbers(nums1 , m , nums2 , n);
        for(int i = 0 ; i < nums1.length ; i++)
            System.out.print(nums1[i] + " ");
    }
}
