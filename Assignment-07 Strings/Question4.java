
// **Question 4**

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.


public class Question4 {
    private static String reverseString(String s) {
        String[] str=s.split(" ");
	   String finalresult="";
	   for(int i=0;i<str.length;i++){
	   	String result="";
	   	for(int j=0;j<str[i].length();j++){
	   		result+=str[i].charAt(str[i].length()-j-1);
	   	}
	   	result+=" ";
	   	finalresult+=result;
	   }
        return finalresult.trim();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseString(s));
    }
}
