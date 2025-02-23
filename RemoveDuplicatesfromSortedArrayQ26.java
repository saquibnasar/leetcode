public class RemoveDuplicatesfromSortedArrayQ26 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }

    // public static int removeDuplicates(int[] nums) {
    // int k = 1;
    // int max = 0;
    // for (int j = 1; j < nums.length; j++) {
    // if (nums[j] == nums[j - 1]) {
    // int i = j + 1;
    // if (i == nums.length) {
    // return k;
    // }
    // while (nums[max] >= nums[i]) {
    // i++;
    // if (i == nums.length) {
    // return k;
    // }
    // }
    // nums[max + 1] = nums[i];
    // max++;
    // j = i;
    // k++;
    // } else {
    // k++;
    // if (nums[max] < nums[j]) {
    // nums[max + 1] = nums[j];
    // }
    // max++;
    // }

    // }
    // return k;
    // }

}