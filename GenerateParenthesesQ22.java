import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesQ22 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<Character> stack = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        backString(n, 0, 0, stack, ans);
        return ans;
    }

    public static void backString(int n, int openNum, int closeNum, List<Character> stack, List<String> ans) {
        if (openNum == closeNum && closeNum == n) {
            ans.add(stack.toString());
            return;
        }
        if (openNum < n) {
            stack.add('(');
            backString(n, openNum + 1, closeNum, stack, ans);
            stack.remove(stack.size() - 1);
        }
        if (closeNum < openNum) {
            stack.add(')');
            backString(n, openNum, closeNum + 1, stack, ans);
            stack.remove(stack.size() - 1);
        }
    }
}
