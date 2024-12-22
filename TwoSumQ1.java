import java.util.Arrays;

public class TwoSumQ1 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[0];
        }
        int i = 0;
        int j = 1;
        int[] ans = new int[2];

        while (i < nums.length) {
            if (i != j && nums[i] + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }

            j++;
            if (j >= nums.length) {
                i++;
                j = 0;
            }
        }

        return new int[0];
    }

}
