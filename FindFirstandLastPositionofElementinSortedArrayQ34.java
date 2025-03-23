public class FindFirstandLastPositionofElementinSortedArrayQ34 {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 8, 10, 11 };
        System.out.println(searchRange(arr, 5));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int[] ans = new int[2];

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                if (left != target) {
                    left = left + 1;
                }
                if (right != target) {
                    right = right - 1;
                }

            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return ans;
    }
}
