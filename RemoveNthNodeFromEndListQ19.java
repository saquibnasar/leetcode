import java.util.Arrays;

public class RemoveNthNodeFromEndListQ19 {
    public static void main(String[] args) {
        int[] head = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(removeNthFromEnd(2, head)));

    }

    public static int[] removeNthFromEnd(int n, int[] head) {
        int[] result = new int[head.length - 1];
        int i = 0;
        for (int j = 0; j < head.length; j++) {
            if (j != n + 1) {
                result[i] = head[j];
                i++;
            }
        }
        return result;
    }
}
