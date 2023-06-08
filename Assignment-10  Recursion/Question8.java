

// **Question 8**

// Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.


public class Question8 {
    private static boolean consonant(char ch){
        ch = Character.toUpperCase(ch);
        return !(ch == 'A' || ch == 'E' || 
                ch == 'I' || ch == 'O' || 
                ch == 'U') && ch >= 65 && ch <= 90;
    }
   
    private static int allConsonants(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
            if (consonant(str.charAt(i)))
                ++count;
        return count;
    }
      
    public static void main(String args[])
    {
        String str = "abc de";
        System.out.println( allConsonants(str));
    }
}
