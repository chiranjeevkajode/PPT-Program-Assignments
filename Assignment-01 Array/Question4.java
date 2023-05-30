
// **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

import java.util.Arrays;

public class Question4 {
    private static int[] addNumber(int[] digits){
        int num = digits.length -1;

        while (num >= 0 && digits[num] == 9) {
            num--;
        }

        if (num == -1) {
            int[] result = new int[digits.length +1];
            result[0] = 1;
            return result;
        }

        int[] result = new int[digits.length];

        result[num] = digits[num] + 1;

        for (int i = 0; i < num; i++) {
            result[i] = digits[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int[] ans = addNumber(arr);
        System.out.println(Arrays.toString(ans));
        
    }
}
