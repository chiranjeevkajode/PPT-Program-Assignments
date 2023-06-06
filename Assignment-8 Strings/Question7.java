
//  **Question 7**

// Given an encoded string, return its decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

// The test cases are generated so that the length of the output will never exceed 105.



import java.util.Deque;
import java.util.LinkedList;

public class Question7 { 


    private static String decodeString(String s) {
        Deque<Character> queue = new LinkedList<>();
        for (char c: s.toCharArray()) {
          queue.offer(c);
        }
        return bfs(queue);
      }
    
      private static String bfs(Deque<Character> queue) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (!queue.isEmpty()) {
          char c = queue.poll();
          
          if (Character.isDigit(c)) {
            num = num * 10 + c - '0';
          } 
         
          else if (c == '[') {
            String sub = bfs(queue);
            for (int i = 0; i < num; i++) {
              sb.append(sub);
            }
            num = 0;
          }
          
          else if (c == ']') {
            break;
          }
          
          else {
            sb.append(c);
          }
        }
    
        return sb.toString();
      }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}