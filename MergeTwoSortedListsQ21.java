import java.util.Arrays;

public class MergeTwoSortedListsQ21 {
    public static void main(String[] args) {
        int[] l1 = { 1, 2, 4 };
        int[] l2 = { 1, 3, 4 };
        System.out.println(Arrays.toString(mergeTwoLists(l1, l2)));
    }

    static int[] mergeTwoLists(int[] list1, int[] list2) {
        int[] ans = new int[list1.length + list2.length];

        int i = 0;
        int j = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                ans[i + j] = list1[i];
                i++;
            } else {
                ans[i + j] = list2[j];
                j++;
            }
        }
        while (i < list1.length) {
            ans[i + j] = list1[i];
            i++;
        }
        while (j < list2.length) {
            ans[i + j] = list2[j];
            j++;
        }
        return ans;
    }
}
