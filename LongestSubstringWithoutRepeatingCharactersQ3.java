public class LongestSubstringWithoutRepeatingCharactersQ3 {
    public static void main(String[] args) {
        String subString = "pwwkew";
        String ans = longeString(subString);
        System.out.println(ans);
    }

    static String longeString(String oriiString) {
        String ans = oriiString.charAt(0) + "";
        String ans1 = oriiString.charAt(0) + "";
        String ans2 = "";
        for (int i = 1; i < oriiString.length(); i++) {
            String isTrue = test(oriiString.charAt(i), ans1);
            if (isTrue.length() == 0 | ans2.length() > 0) {
                String anstrue = test(oriiString.charAt(i), ans2);
                if (anstrue.length() == 0) {
                    if (ans1.length() > ans2.length()) {
                        ans = ans1;
                        ans1 = "";
                        ans2 = "";
                    } else {
                        ans = ans2;
                        ans1 = "";
                        ans2 = "";
                    }
                } else {
                    ans2 = anstrue;
                }
            } else {
                ans1 = isTrue;
            }

        }

        return ans;
    }

    static String test(char newchar, String ans) {
        for (int i = 0; i < ans.length(); i++) {
            char left = ans.charAt(i);
            if (left == newchar) {
                return "";
            }

        }
        return ans + newchar;
    }
}
