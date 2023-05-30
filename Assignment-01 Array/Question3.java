

// **Q3.**Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.



public class Question3 {
    private static int searchNumber(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = (start + end) /2;

            if (nums[mid] == target) {
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return end +1;
    }

    public static void main(String[] args) {
        System.out.println(searchNumber(new int[] {1,3,5,6},5));
    }
}
