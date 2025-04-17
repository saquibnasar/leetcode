import java.util.ArrayList;
import java.util.List;

public class CombinationSumQ39 {
    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        backtrack(candidates, target, currentCombination, result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, List<Integer> currentCombination,
            List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                currentCombination.add(candidates[i]);
                backtrack(candidates, target - candidates[i], currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

    // Time Complexity: O(n * 2^n)
    // Space Complexity: O(n * 2^n)
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        backtrack2(candidates, target, currentCombination, result);
        return result;
    }

    private static void backtrack2(int[] candidates, int target, List<Integer> currentCombination,
            List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                currentCombination.add(candidates[i]);
                backtrack2(candidates, target - candidates[i], currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
