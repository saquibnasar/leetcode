import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3Q16 {
    public static void main(String[] args) {
        int[] num = { -1, 0, 1, 2, -1, -4 };
        System.out.println(sum3(num));

    }

    public static List<List<Integer>> sum3(int[] nums) {

        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        // sort the element
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        // now fix the first element and find other two element
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // add the set , and move to find other triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }

            }
        }

        return new ArrayList<>(result);
    }

    // public static ArrayList<Integer> sum3(int[] nums) {
    // if (nums.length < 3)
    // return new ArrayList<Integer>();
    // // if the array is less than 3 then return empty array
    // // if the array is 3 then return array

    // // two pointers stay on the same index then 3 one pointer moves until the end
    // // int[][] result = new int[nums.length][3];
    // Set<Arrays> set = new HashSet<Arrays>();
    // ArrayList<Integer> result = new ArrayList<Integer>();
    // int s = 0;
    // int i = 0;
    // int j = 1;
    // int k = 2;

    // while (j < nums.length) {
    // if (k != i && k != j && nums[i] + nums[j] + nums[k] == 0) {
    // // todo add new array to result
    // result.add(nums[i]);
    // result.add(nums[j]);
    // result.add(nums[k]);
    // // result[s][0] = nums[i];
    // // result[s][1] = nums[j];
    // // result[s][2] = nums[k];
    // s++;
    // }
    // k++;
    // if (k == nums.length) {
    // i++;
    // j++;
    // k = 0;
    // }
    // }

    // return result;
    // }

}
