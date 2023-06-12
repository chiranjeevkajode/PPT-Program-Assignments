//  **Question 5**

// Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must be **unique** and you may return the result in **any order**.


import java.util.Arrays;
import java.util.HashSet;

public class Question5{
     private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> app = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i ++) {
            app.add(nums1[i]);
        }
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i ++) {
            if (app.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (Integer j:res) {
            result[i++] = j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}