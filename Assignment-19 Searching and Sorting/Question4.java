import java.util.Arrays;

public class Question4 {
     public static void reorder(int[] A)
    {
        int k = 0;
 
        for (int i: A)
        {
            
            if (i != 0) {
                A[k++] = i;
            }
        }
 
        for (int i = k; i < A.length; i++) {
            A[i] = 0;
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 0, 4, 3, 0, 5, 0};
 
        reorder(A);
        System.out.println(Arrays.toString(A));
    }
}
