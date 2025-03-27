import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArrayQ34 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(Arrays.toString(searchRange(arr, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int[] ans = new int[] { -1, -1 };

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                // first occurrence
                while (left <= right) {
                    mid = left + (right - left) / 2;

                    // if (nums[mid] == target) {
                    // if (nums[mid] == target && nums[mid - 1] > target) {
                    if (nums[mid] == target && (mid > 0 || nums[mid - 1] > target)) {
                        ans[0] = mid;
                        break;
                    }
                    if (nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }

                }
                if (ans[0] == -1)
                    ans[0] = mid;

                left = mid + 1;
                right = nums.length - 1;
                while (left <= right) {
                    mid = left + (right - left) / 2;

                    if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > target)) {
                        ans[1] = mid;
                        return ans;
                    }
                    if (nums[mid] <= target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }

                }
                ans[1] = ans[0];
                return ans;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return ans;
    }
}
