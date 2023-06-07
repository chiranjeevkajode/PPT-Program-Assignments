
//  **Question 5**

// Given an array of integers **arr**, the task is to find maximum element of that array using recursion.


public class Question5 {
    static int[] arr =  {1, 4, 3, -5, -4, 8, 6};

    private static int maximum(){
        int i;
        int max = arr[0];

        for ( i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        
        System.out.println(maximum());
    }
}
