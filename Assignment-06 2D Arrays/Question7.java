
//  **Question 7**

// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.



import java.util.Arrays;

public class Question7 {
    private static int[][] generateMatrix(int n) {
        if(n<=0) return new int[0][];
        int[][] result=new int[n][n];
        int xBeg=0,xEnd=n-1;
        int yBeg=0,yEnd=n-1;
        int cur=1;
        while(true){
            for(int i=yBeg;i<=yEnd;i++) result[xBeg][i]=cur++;
            if(++xBeg>xEnd) break;
            for(int i=xBeg;i<=xEnd;i++) result[i][yEnd]=cur++;
            if(--yEnd<yBeg) break;
            for(int i=yEnd;i>=yBeg;i--) result[xEnd][i]=cur++;
            if(--xEnd<xBeg) break;
            for(int i=xEnd;i>=xBeg;i--) result[i][yBeg]=cur++;
            if(++yBeg>yEnd) break;
        }
        return result;    
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generateMatrix(n);
        System.out.println(Arrays.deepToString(ans));
    }
}
