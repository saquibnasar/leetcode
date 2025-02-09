import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumQ18 {
    public static void main(String[] args) {
        int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
        System.out.println(fourSum(nums, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int numberOfLopp = 4;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> quad = new ArrayList<>();
        KSumRecursion(nums, result, quad, target, numberOfLopp, 0);

        return result;
    }

    public static void KSumRecursion(int[] nums, List<List<Integer>> result, List<Integer> quad, long target, int k,
            int startIndex) {

        if (k != 2) {
            for (int i = startIndex; i < nums.length - 1; i++) {
                if (i > startIndex && nums[i] == nums[i - 1]) {
                    continue;
                }
                quad.add(nums[i]);
                // long newtarget = (target * 1l - nums[i] * 1l);
                KSumRecursion(nums, result, quad, target - nums[i], k - 1, i + 1); // newtarget
                quad.remove(quad.size() - 1);
            }
        } else {

            int left = startIndex;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    quad.add(nums[left]);
                    quad.add(nums[right]);
                    List<Integer> temp = new ArrayList<>(quad);
                    result.add(temp);
                    // quad.clear();
                    quad.remove(quad.size() - 1);
                    quad.remove(quad.size() - 1);
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }

                }
            }
        }

    }

}
