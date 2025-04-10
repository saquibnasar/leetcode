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
        // if (candidates.length == 0) {
        // return result;
        // }
        if (target == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(candidates[i]); // add the current candidate
            result.addAll(combinationSum(candidates, target - candidates[i]));
            result.addAll(combinationSum(candidates, target));
        }
        return result;
    }
}
