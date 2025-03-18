public class SearchInRotatedSortedArrayQ33 {
    public static void main(String[] args) {
        int[] nums = { 2, 1 };
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {

        // find the pivot
        // then find the
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        // find the pivot
        if (nums[mid] < nums[mid - 1]) {
            if (target <= nums[nums.length - 1]) {
                start = mid;
            } else {
                end = mid;
            }
        } else if (nums[mid] > nums[mid + 1]) {
            if (target >= nums[0]) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }

        while (start <= end) {
            mid = start + (end - start) / 2;

            // if the target is less than the mid, then the target is in the left half
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // if the target is equal to the mid, then the target is in the mid
                return mid;
            }

        }

        return -1;
    }
}
