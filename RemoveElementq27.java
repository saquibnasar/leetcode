public class RemoveElementq27 {
    public static void main(String[] args) {
        int[] nums = { 2 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    // public static int removeElement(int[] nums, int val) {
    // int k = 0;
    // int end = nums.length;
    // for (int j = 0; j < end; j++) {
    // if (nums[j] != val) {
    // nums[k] = nums[j];
    // k++;
    // }
    // }
    // return k;
    // }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int end = nums.length;
        for (int j = 0; j < end; j++) {
            if (nums[j] != val) {
                nums[k] = nums[j];
                k++;
            } else if (nums[j] == val) {
                for (int i = end - 1; i > k; i--) {
                    if (nums[i] != val) {
                        nums[k] = nums[i];
                        nums[i] = val;

                        end = i;
                        k++;
                        break;
                    }
                }
            }

        }
        return k;
    }
}
