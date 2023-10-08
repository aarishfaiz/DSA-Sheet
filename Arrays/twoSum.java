import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    public static int[] twoSum(int[] arr, int sum) {
        // Time complexity is O(n^n)
//        for(int i=0;i<arr.length-1;i++) {
//            for(int j=i+1;j<arr.length;j++) {
//                if(arr[i] + arr[j] == sum) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[0];

        // NOW WITH TIME COMPLEXITY O(N);
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int sum = 9;
        System.out.println(Arrays.toString(twoSum(arr,sum)) );
    }
}
