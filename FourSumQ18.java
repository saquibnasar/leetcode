import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumQ18 {
    public static void main(String[] args) {
        int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
        System.out.println(1000000000 + 1000000000 + 1000000000 + 1000000000);

        System.out.println(fourSum(nums, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // if (-294967296 == target || target == 294967296)
        // return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                if (left == j || right == j)
                    continue;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (result.contains(Arrays.asList(nums[i], nums[j], nums[left], nums[right]))) {
                        break;
                    }
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;

                    } else if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        while (nums[left] == nums[left - 1] && left < right) {
                            left++;
                        }
                    }
                }

            }
        }
        return result;
    }
}
