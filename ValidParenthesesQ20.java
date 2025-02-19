import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ValidParenthesesQ20 {
    public static void main(String[] args) {
        String s = "({{{{}}}))";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

    public static boolean isValid(String s) {

        List<Character> stack = new ArrayList<>();
        LinkedHashMap<Character, Character> closeToOpen = new LinkedHashMap<>();

        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (closeToOpen.containsKey(s.charAt(i))) {
                if (!stack.isEmpty() && stack.get(stack.size() - 1) == closeToOpen.get(s.charAt(i))) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            } else {
                stack.add(s.charAt(i));

            }

        }
        if (stack.size() == 0) {
            return true;
        }

        return false;
    }

}
