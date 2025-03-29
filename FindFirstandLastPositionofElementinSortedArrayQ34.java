import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArrayQ34 {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int[] ans = new int[] { -1, -1 };
        int leftValue = binarySearch(nums, target, true);
        int rightValue = binarySearch(nums, target, false);

        ans[0] = leftValue;
        ans[1] = rightValue;

        return ans;

    }

    public static int binarySearch(int[] nums, int target, boolean leftBias) {
        int left = 0;
        int right = nums.length - 1;
        int i = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                i = mid;
                if (leftBias) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }

        }
        return i;
    }

    // public static int[] searchRange(int[] nums, int target) {
    // if (nums.length == 0)
    // return new int[] { -1, -1 };
    // int[] ans = new int[] { -1, -1 };

    // int left = 0;
    // int right = nums.length - 1;
    // while (left <= right) {
    // int mid = left + (right - left) / 2;

    // if (nums[mid] == target) {

    // // first occurrence
    // while (left <= right) {
    // mid = left + (right - left) / 2;

    // // if (nums[mid] == target) {
    // // if (nums[mid] == target && nums[mid - 1] > target) {
    // if (nums[mid] == target && (mid > 0 || nums[mid - 1] > target)) {
    // ans[0] = mid;
    // break;
    // }
    // if (nums[mid] < target) {
    // left = mid + 1;
    // } else {
    // right = mid - 1;
    // }

    // }
    // if (ans[0] == -1)
    // ans[0] = mid;

    // left = mid + 1;
    // right = nums.length - 1;
    // while (left <= right) {
    // mid = left + (right - left) / 2;

    // if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] >
    // target)) {
    // ans[1] = mid;
    // return ans;
    // }
    // if (nums[mid] <= target) {
    // left = mid + 1;
    // } else {
    // right = mid - 1;
    // }

    // }
    // ans[1] = ans[0];
    // return ans;
    // } else if (nums[mid] > target) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }

    // }

    // return ans;
    // }
}
