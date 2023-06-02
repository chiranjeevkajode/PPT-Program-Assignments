
//  **Question 7**
// You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

// Count and return *the number of maximum integers in the matrix after performing all the operations*



public class Question7 {
    private static int maxCount(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(op[0], minRow);
            minCol = Math.min(op[1], minCol);
        }
        return minRow * minCol;
    }
    public static void main(String[] args) {
        System.out.println(maxCount(3, 3, new int[][]{{2,2},{3,3}}));
    }
}
