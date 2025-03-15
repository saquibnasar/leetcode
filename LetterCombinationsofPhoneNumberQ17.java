import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofPhoneNumberQ17 {
    public static void main(String[] args) {
        String digits = "237";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        List<String> result = new ArrayList<>();

        HashMap<Character, String> phonHashMap = new HashMap<Character, String>();
        phonHashMap.put('2', "abc");
        phonHashMap.put('3', "def");
        phonHashMap.put('4', "ghi");
        phonHashMap.put('5', "jkl");
        phonHashMap.put('6', "mno");
        phonHashMap.put('7', "pqrs");
        phonHashMap.put('8', "tuv");
        phonHashMap.put('9', "wxyz");

        for (int i = 0; i < digits.length(); i++) {
            String ans = phonHashMap.get(digits.charAt(i));
            List<String> temp = new ArrayList<>(result);
            for (int j = 0; j < ans.length(); j++) {

                if (i > 0) {
                    for (int j2 = temp.size() * j; j2 < result.size(); j2++) {
                        result.set(j2, result.get(j2) + ans.substring(j, j + 1));
                    }
                } else {
                    result.add(ans.substring(j, j + 1));
                }
                if (i > 0 && j < ans.length() - 1) {
                    result.addAll(temp);

                }
            }

        }

        return result;
    }

}
