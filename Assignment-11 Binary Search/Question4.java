
// **Question 4**

// Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

// There is only **one repeated number** in `nums`, return *this repeated number*.

// You must solve the problem **without** modifying the array `nums` and uses only constant extra space.


import java.util.Arrays;

public class Question4 {
    private static int findDuplicate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int arr[] = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
