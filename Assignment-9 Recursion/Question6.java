
//  **Question 6**

// Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, the task is to find Nth term of the series.


public class Question6 {
    private  static int nthSeries(int a, int d, int N){
        return (a + (N -1) * d);
    }
    public static void main(String[] args) {
        System.out.println(nthSeries(2, 1, 5));
    }
}
