import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestPalindromicSubstringQ5 {

    public static void main(String[] args) {
        String string = "aaaabaaa";

        String ans = longestPalindromicSubstring(string);
        System.out.println(ans);

    }

    static String longestPalindromicSubstring(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String result = s.charAt(0) + "";
        HashMap<Character, List<Integer>> hashMap = new HashMap<>();

        hashMap.put(s.charAt(0), List.of(0));
        for (int i = 1; i < s.length(); i++) {
            List<Integer> complexIndex = hashMap.get(s.charAt(i));
            if (complexIndex != null) {
                for (int j = 0; j < complexIndex.size(); j++) {
                    int complex = complexIndex.get(j);
                    if (s.charAt(complex) == s.charAt(i)) {
                        Boolean ans = palindromic(complex, i, s);
                        if (ans && i - complex > result.length() - 1) {
                            result = s.substring(complex, i + 1);
                        }
                    }
                }
            }
            if (complexIndex != null) {
                List<Integer> li = new ArrayList<>(complexIndex);
                li.add(i);
                hashMap.put(s.charAt(i), li);
            } else {
                hashMap.put(s.charAt(i), List.of(i));

            }
        }

        return result;
    }

    static boolean palindromic(int start, int end, String word) {
        if (start > end) {
            return true;
        }
        if (word.charAt(start) == word.charAt(end)) {
            return palindromic(start + 1, end - 1, word);
        }
        return false;
    }
}
