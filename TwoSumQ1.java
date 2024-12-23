import java.util.Arrays;
import java.util.HashMap;

public class TwoSumQ1 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complexIndex = hashMap.get(nums[i]);
            if (complexIndex != null) {
                return new int[] { complexIndex, i };
            } else {
                hashMap.putIfAbsent(target - nums[i], i);
            }

        }

        return nums;
    }

    // public static int[] twoSum(int[] nums, int target) {
    // if (nums.length < 2) {
    // return new int[0];
    // }
    // int i = 0;
    // int j = 1;
    // int[] ans = new int[2];

    // while (i < nums.length) {
    // if (i != j && nums[i] <= target && nums[j] <= target && nums[i] + nums[j] ==
    // target) {
    // ans[0] = i;
    // ans[1] = j;
    // return ans;
    // }

    // j++;
    // if (j >= nums.length) {
    // i++;
    // j = 0;
    // }
    // }

    // return new int[0];
    // }

}
