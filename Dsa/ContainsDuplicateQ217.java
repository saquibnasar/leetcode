package Dsa;

public class ContainsDuplicateQ217 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1 };
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
