package Dsa;

import java.util.HashMap;

public class ContainsDuplicateIIQ219 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        System.out.println(containsNearbyDuplicate2(arr, 2));
    }

    public static boolean containsNearbyDuplicate2(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                if (Math.abs(map.get(arr[i]) - i) <= k) {
                    return true;
                }

            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }
}
