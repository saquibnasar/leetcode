import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofPhoneNumberQ17 {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        HashMap<String, String> phonHashMap = new HashMap<String, String>();
        phonHashMap.put("2", "abc");
        phonHashMap.put("3", "def");
        phonHashMap.put("4", "ghi");
        phonHashMap.put("5", "jkl");
        phonHashMap.put("6", "mno");
        phonHashMap.put("7", "pqrs");
        phonHashMap.put("8", "tuv");
        phonHashMap.put("9", "wxyz");

        return new ArrayList<>();
    }

    // public static List<String> letterCombinations(String digits) {

    // }

}
