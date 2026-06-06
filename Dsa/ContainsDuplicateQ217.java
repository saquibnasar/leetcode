package Dsa;

import java.util.HashMap;

public class ContainsDuplicateQ217 {
    public static void main(String[] args) {
        int[] arr = { 3, 3 };
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }

        }
        return false;
    }

}
