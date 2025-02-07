import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumQ18 {
    public static void main(String[] args) {
        int[] nums = { -2, -1, 0, 0, 1, 2 };

        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // using recusion
        KSumRecursion(nums, target);
        return result;
    }

    public static List<List<Integer>> KSumRecursion(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }
    // public static List<int[]> sum3(int[] nums) {

    // if (nums == null || nums.length < 3)
    // return new ArrayList<>();

    // Arrays.sort(nums);
    // List<int[]> li = new ArrayList<>();
    // for (int i = 0; i < nums.length - 2; i++) {
    // if (i > 0 && nums[i] == nums[i - 1]) {
    // continue;
    // }
    // int left = i + 1;
    // int right = nums.length - 1;

    // while (left < right) {
    // int sum = nums[i] + nums[left] + nums[right];
    // if (sum > 0) {
    // right--;
    // } else if (sum < 0) {
    // left++;
    // } else {
    // li.add(new int[] { nums[i], nums[left], nums[right] });
    // left++;
    // while (nums[left] == nums[left - 1] && left < right) {
    // left++;
    // }
    // }

    // }
    // }
    // return li;

    // }
}
