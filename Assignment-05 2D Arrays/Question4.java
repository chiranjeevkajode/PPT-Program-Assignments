

// **Question 4**

// Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

// - answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
// - answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

// **Note** that the integers in the lists may be returned in **any** order.




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question4 {
    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int x:nums1){
            mp.put(x,1);
        }

        for(int x:nums2){
            if(mp.getOrDefault(x,0) == 1)
                mp.put(x,3);
            else if(mp.getOrDefault(x,0) == 0)
                mp.put(x,2);
        }

        List<Integer> f1 = new ArrayList<>();
        List<Integer> f2 = new ArrayList<>();
        for(int x:nums1){
            if(mp.getOrDefault(x,0) == 1){
                mp.put(x,0);
                f1.add(x);
            }

        }

        ans.add(f1);
        for(int x:nums2){
            if(mp.getOrDefault(x,0) == 2){
                mp.put(x,0);
                f2.add(x);
            }
        }


        ans.add(f2);

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }
}
