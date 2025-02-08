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
        int numberOfLopp = 3;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<Integer> test = KSumRecursion(nums, target - nums[i], numberOfLopp, i);
            if (test.size() == 0) {
                continue;
            }
            test.add(nums[i]);
            result.add(test);
        }

        return result;
    }

    public static List<Integer> KSumRecursion(int[] nums, int target, int k, int startIndex) {
        List<Integer> result = new ArrayList<>();
        if (k != 2) {
            for (int i = startIndex + 1; i < nums.length - 1; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                List<Integer> test = KSumRecursion(nums, target - nums[i], k - 1, i);
                if (test.size() == 0) {
                    continue;
                }
                test.add(nums[i]);
                // return test;
            }
        }
        int left = startIndex + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                result.add(nums[left]);
                result.add(nums[right]);
                return result;

            }
        }

        return new ArrayList<>();
    }

    // public static List<Integer> helper(int[] nums, int target, int k, int i) {
    // if (k == 2) {
    // int left = k + 1;
    // int right = nums.length - 1;
    // while (left < right) {
    // int sum = nums[k] + nums[left] + nums[right];
    // if (sum > 0) {
    // right--;
    // } else if (sum < 0) {
    // left++;
    // } else {
    // left++;
    // while (nums[left] == nums[left - 1] && left < right) {
    // left++;
    // }
    // }
    // }
    // }
    // return new ArrayList<>();
    // }
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
