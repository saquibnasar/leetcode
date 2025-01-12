import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofPhoneNumberQ17 {
    public static void main(String[] args) {
        String digits = "23456789";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        return new ArrayList<>();
    }

}
