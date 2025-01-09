public class SumClosestQ16 {
    public static void main(String[] args) {
        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

    }

    public static int threeSumClosest(int[] nums, int target) {
        int max = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentValue = nums[i] + nums[j] + nums[k];
                    int gap = Math.abs(max - target);
                    int currentGap = Math.abs(currentValue - target);
                    if (currentGap < gap) {
                        max = currentValue;
                    }
                }
            }
        }
        return max;
    }
}
