
// Question 2
// Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

// The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

// Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

import java.util.HashMap;

public class Question2 {
    private static int distributeCandy(int[] candyType){
        int i = candyType.length;
        int limit = i/2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int nums : candyType){
            if(map.containsKey(nums))
                map.put(nums, map.get(nums)+1);
            else
                map.put(nums,1);

        }

        if(map.size() <= limit)
            return map.size();
        else
            return limit;
        
    }

    public static void main(String[] args) {
        System.out.println(distributeCandy(new int[]{1,1,2,2,3,3}));
    }
}
