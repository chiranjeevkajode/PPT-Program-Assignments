
//  **Question 4**

// Given a string calculate length of the string using recursion.


public class Question4 {
    private static int length(String str) {
        if (str.equals(""))
          return 0;
        else
          return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {

        String str = "abcd";
        
        System.out.println( length(str));
    }
    
}
