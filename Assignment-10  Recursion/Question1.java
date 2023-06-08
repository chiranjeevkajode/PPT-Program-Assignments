
// **Question 1**

// Given an integer `n`, return *`true` if it is a power of three. Otherwise, return `false`*.

// An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.


public class Question1{
    private static boolean poweOfThree(int n){
        int c = 0;
        boolean x = false;
        if(n != 0){
            while (c == 0) {
                if (n == 1) {
                    x = true;
                    break;
                }
                c = n % 3;
                n = n /3;
            }
        }
        return x;

    }
    public static void main(String[] args) {
        System.out.println(poweOfThree(27));
    }
}