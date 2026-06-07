package Dsa;

import java.util.HashMap;
import java.util.TreeSet;

public class ContainsDuplicateIIIQ220 {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 15, 1, 6, 1, 9, 15 };
        int k = 1;
        int t = 3;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));

    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> window = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long current = nums[i];

            Long candidate = window.ceiling(current - (long) valueDiff);

            if (candidate != null &&
                    candidate <= current + (long) valueDiff) {
                return true;
            }

            window.add(current);

            if (window.size() > indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}
