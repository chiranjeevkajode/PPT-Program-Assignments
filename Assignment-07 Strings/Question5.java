
//  **Question 5**

// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.


public class Question5 {
    private static String reverseString(String s, int k) {
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        int left = 0;
        boolean rev = false;
        for (int i = 0; i < len; i++) {
            if (i % k == 0) {
                String subStr = s.substring(left, i);
                if (rev) {
                    subStr = new StringBuilder(subStr).reverse().toString();
                }
                builder.append(subStr);
                left = i;
                rev = !rev;
            }
        }
        String subStr = s.substring(left, len);
        if (rev) {
            subStr = new StringBuilder(subStr).reverse().toString();
        }
        builder.append(subStr);
        return builder.toString();
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseString(s,k));
    }
}
