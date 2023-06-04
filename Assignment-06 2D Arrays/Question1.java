
//  **Question 1**

// A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

// - s[i] == 'I' if perm[i] < perm[i + 1], and
// - s[i] == 'D' if perm[i] > perm[i + 1].

// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.



import java.util.Arrays;

public class Question1{
    private static int[] diPermulatio (String S) {
        int[] result = new int[S.length() + 1];
        int leftPointer = 0;
        int rightPointer = S.length();
        int index = 0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'I') result[index++] = leftPointer++;
            else result[index++] = rightPointer--;
        }
        if(S.charAt(S.length() -1) == 'I') result[index] = leftPointer;
        else result[index] = rightPointer;
        return result;
    }
    

    public static void main(String[] args) {

        String s = "IDID";
        int[] ans = diPermulatio(s);
        System.out.println(Arrays.toString(ans));
    }
}