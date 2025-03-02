import java.util.ArrayList;
import java.util.List;

public class FindSubset {
    public static void main(String[] args) {
        int[] arr = { 1, };

        System.out.println(findSubset(arr));
    }

    public static List<List<Integer>> findSubset(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();

        backTraking(arr, 0, ans, stack);

        return ans;
    }

    public static void backTraking(int[] arr, int pointer, List<List<Integer>> ans,
            List<Integer> stack) {
        if (pointer == arr.length) {
            if (stack.size() == 0) {
                return;
            }
            List<Integer> temp = new ArrayList<>(stack);
            ans.add(temp);
            return;

        }
        // take the value
        stack.add(arr[pointer]);
        backTraking(arr, pointer + 1, ans, stack);
        stack.remove(stack.size() - 1);
        // not take the value
        backTraking(arr, pointer + 1, ans, stack);
    }
}
