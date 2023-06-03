// **Question 8**

// An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

// Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {
    public static List<Integer>
    findOriginal(int[] arr)
    {
 
        Map<Integer, Integer> numFreq
            = new HashMap<>();
 
        for (int i = 0; i < arr.length; i++) {
            numFreq.put(
                arr[i],
                numFreq.getOrDefault(arr[i], 0)
                    + 1);
        }
 
        Arrays.sort(arr);
 
        List<Integer> res = new ArrayList<>();
 
        for (int i = 0; i < arr.length; i++) {
 
            int freq = numFreq.get(arr[i]);
            if (freq > 0) {
 
                res.add(arr[i]);
 
                numFreq.put(arr[i], freq - 1);
 
                int twice = 2 * arr[i];
 
                numFreq.put(
                    twice,
                    numFreq.get(twice) - 1);
            }
        }
 
        return res;
    }
 
    public static void main(String[] args)
    {
 
        List<Integer> res = findOriginal(
            new int[] { 1,3,4,2,6,8});
 
        for (int i = 0; i < res.size(); i++) {
            System.out.print(
                res.get(i) + " ");
        }
    }
}
