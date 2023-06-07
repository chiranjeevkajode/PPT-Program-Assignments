

// **Question 1**

// Given an integer `n`, return *`true` if it is a power of two. Otherwise, return `false`*.

// An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.


public class Question1{
    private static boolean powerOfTwo(int n){
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;

        }
        return count == 1;

    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(16));
    }
}