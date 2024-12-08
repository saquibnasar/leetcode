import java.util.Arrays;

public class MergeTwoSortedListsQ21 {
    public static void main(String[] args) {
        int[] l1 = { 1, 2, 4 };
        int[] l2 = { 1, 3, 4 };
        System.out.println(Arrays.toString(mergeTwoLists(l1, l2)));
    }

    static int[] mergeTwoLists(int[] l1, int[] l2) {
        int[] ans = new int[l1.length + l2.length];

        int i = 0;
        int j = 0;
        while (i < l1.length && j < l2.length) {
            if (l1[i] < l2[j]) {
                ans[i + j] = l1[i];
                i++;
            } else {
                ans[i + j] = l2[j];
                j++;
            }
        }
        while (i < l1.length) {
            ans[i + j] = l1[i];
            i++;
        }
        while (j < l2.length) {
            ans[i + j] = l2[j];
            j++;
        }
        return ans;
    }
}
