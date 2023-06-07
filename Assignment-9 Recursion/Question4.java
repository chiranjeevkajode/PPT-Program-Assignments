
// **Question 4**

// Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.


public class Question4 {
    public static void main(String[] args) {
        int n = 2, p = 5;
        long result = 1;
        while (p != 0) {
            result *= n;
            --p;
        }
        System.out.println(result);
    }
}
