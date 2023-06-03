
//  **Question 1**

// Convert 1D Array Into 2D Array

// You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

// The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

// Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.




import java.util.Arrays;

public class Question1{
    private static int[][] convert1DTo2D(int[] original, int m, int n){
        int n1 = original.length;
        if(n1 != m*n) return new int[0][0];
        
        int ans[][] = new int[m][n];
        for(int i = 0;i <n1;i++){
            int nr = i/n;
            int nc = i%n;
            ans[nr][nc] = original[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int m = 2,n=2;
        int[][] result = convert1DTo2D(nums, m, n);
        System.out.println( Arrays.deepToString(result));
    }
}