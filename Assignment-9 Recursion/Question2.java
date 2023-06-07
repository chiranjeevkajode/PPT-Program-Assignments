
//  **Question 2**

// Given a number n, find the sum of the first natural numbers.


public class Question2 {
    private static int firstNaturalNum(int n){
        int sum = 0;
        
        for (int i = 1; i <=n; i++) {
            sum += i;
        
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(firstNaturalNum(3));
    }
}
