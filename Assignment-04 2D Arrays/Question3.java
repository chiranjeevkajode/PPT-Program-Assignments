
// **Question 3**
// Given a 2D integer array matrix, return *the **transpose** of* matrix.

// The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



public class Question3 {
    public static void main(String[] args) {
        int M[][] = { { 1,2,3 }, { 4,5,6 }, { 7,8,9} };
    
        int n = M.length, m = M[0].length;
    
        int M_transpose[][] = new int[m][n];
    
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            M_transpose[j][i] = M[i][j];
          }
        }
    
        for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
            System.out.print(M_transpose[i][j] + "    ");
          }
          System.out.println();
        }
      }
}
