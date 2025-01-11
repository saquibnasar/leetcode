import java.util.Arrays;

public class TwoSumTwoInputArrayIsSortedQ167 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    // loocked up on youtube

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[start] + numbers[end] == target) {
                return new int[] { start + 1, end + 1 };
            } else if (numbers[start] + numbers[end] > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }

        }
        return new int[0];
    }

    // my solution

    // public static int[] twoSum(int[] numbers, int target) {

    // for (int i = 0; i < numbers.length; i++) {
    // int find = target - numbers[i];
    // int start = i + 1;
    // int end = numbers.length - 1;

    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (numbers[mid] == find) {
    // return new int[] { i + 1, mid + 1 };
    // } else if (find > numbers[mid]) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }

    // }
    // }
    // return new int[0];
    // }
}
