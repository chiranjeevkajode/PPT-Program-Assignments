
// **Question 5**
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

// Given the integer n, return *the number of **complete rows** of the staircase you will build*.




public class Question5 {
    private static int arrangeCoins(int n) {

        long start=1;
        long sum=1;
        while( sum <= n){
            sum+= ++start;
        }
        
        return (int) start-1;
        
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
