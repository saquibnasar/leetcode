public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String string = "chd";

        String ans = longestPalindromicSubstring(0, 1, string);
        System.out.println(!ans.isEmpty());
        // output "bab"

        // https://leetcode.com/problems/longest-palindromic-substring/description/

    }

    static String longestPalindromicSubstring(int curret, int check, String s) {

        while (curret < check && curret + 1 != s.length()) {
            if (s.charAt(curret) == s.charAt(check)) {
                Boolean ans = palindromic(curret + 1, check - 1, s);
                if (ans) {
                    return s.substring(curret, check + 1);
                }
            }
            check++;
            if (check == s.length()) {
                curret++;
                check = curret + 1;
            }
        }
        return "";
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
