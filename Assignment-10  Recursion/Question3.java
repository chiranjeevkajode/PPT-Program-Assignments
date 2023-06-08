
//  **Question 3**

// ****Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.



public class Question3 {
    static void powerSet(String str, int index, String curr)
    {
        int n = str.length();
 
        if (index == n) {
            return;
        }
 
        System.out.println(curr);
 
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            powerSet(str, i, curr);
 
            curr = curr.substring(0, curr.length() - 1);
        }
    }
 
    public static void main(String[] args)
    {
        String str = "abc";
        int index = -1;
        String curr = "";
        powerSet(str, index, curr);
    }
}
