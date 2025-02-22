public class RemoveDuplicatesfromSortedArrayQ26 {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int max = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                int i = j + 1;
                if (i < nums.length) {
                    while (nums[max] >= nums[i]) {
                        i++;
                    }
                    nums[max + 1] = nums[i];
                    max++;
                    j = i;
                    k++;
                }
            }

        }
        return k;
    }
    // public static int removeDuplicates(int[] nums) {
    // int k = 1;
    // int max = 0;
    // for (int j = 1; j < nums.length; j++) {
    // if (nums[j] == nums[j - 1]) {
    // if (nums[max] < nums[j + 1]) {
    // nums[max + 1] = nums[j + 1];
    // max++;
    // k++;
    // } else {
    // int i = j + 1;
    // while (nums[max] >= nums[i]) {
    // i++;
    // }
    // nums[max + 1] = nums[i];
    // max++;
    // j = i;
    // k++;
    // }
    // }

    // }
    // return k;
    // }
}