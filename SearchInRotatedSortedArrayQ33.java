public class SearchInRotatedSortedArrayQ33 {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 3, };
        System.out.println(search(nums, 5));
    }

    public static int search(int[] nums, int target) {

        if (nums.length <= 1) {
            if (nums.length == 1 && nums[0] == target) {
                return 0;
            }

            return -1;
        }

        // find the pivot
        // then find the
        int start = 0;
        int end = nums.length - 1;
        int pivot = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {

                if (nums[mid] > nums[mid + 1]) {
                    if (target >= nums[0]) {
                        end = mid;
                        start = 0;

                    } else {
                        start = mid + 1;
                        end = nums.length - 1;
                    }
                } else if (mid != 0 && nums[mid] < nums[mid - 1]) {
                    if (target <= nums[nums.length - 1]) {
                        start = mid;
                        end = nums.length - 1;
                    } else {
                        end = mid;
                        start = 0;
                    }
                }
                pivot = 1;
                break;
            } else if (nums[mid] >= nums[0]) {
                start = mid + 1;
            } else if (nums[mid] <= nums[0]) {
                end = mid - 1;
            } else {
                break;
            }

        }
        if (pivot == -1) {
            start = 0;
            end = nums.length - 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

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
