import java.util.Arrays;

public class SumClosestQ16 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 7, 8, 9 };
        // sort this then sove this
        int target = 15;
        System.out.println(threeSumClosest(nums, target));

    }

    public static int threeSumClosest(int[] nums, int target) {

        if (nums == null || nums.length < 3)
            return 0;
        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int gap = Math.abs(result - target);
                int currentGap = Math.abs(sum - target);
                if (currentGap <= gap) {
                    result = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }

}
