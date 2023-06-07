
//  **Question 3**

// ****Given a positive integer, N. Find the factorial of N. 


public class Question3 {
    private static int factorial(int n){
        int i = 1, f=1;
        while(i<= n)
        {
            f=f*i;
            i++;
        }
        
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
