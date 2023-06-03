
// **Question 2**

// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

// Given the integer n, return *the number of **complete rows** of the staircase you will build*.



public class Question2 {
    private static int arrangeCoin(int n ){
        int le = 0, coin = 1;
        while (n >= coin) {
            n -= coin;
            coin ++;
            le ++;
        }
        return le;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoin(5));
    }
}
