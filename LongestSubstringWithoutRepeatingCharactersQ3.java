public class LongestSubstringWithoutRepeatingCharactersQ3 {
    public static void main(String[] args) {
        String subString = "bbbb";
        String ans = longeString(subString);
        System.out.println(ans);
    }

    static String longeString(String oriiString) {
        String ans = oriiString.charAt(0) + "";
        String l1 = oriiString.charAt(0) + "";
        String l2 = "";
        for (int i = 1; i < oriiString.length(); i++) {
            if (!(l2.length() > 0)) {
                String newChar = test(oriiString.charAt(i), l1);
                if (newChar.length() == 0) {
                    l2 = oriiString.charAt(i) + "";
                } else {
                    l1 = newChar;
                }
            } else {
                String newL2 = test(oriiString.charAt(i), l2);
                if (newL2.length() == 0) {
                    if (l1.length() > l2.length()) {
                        ans = l1;
                        l1 = "";
                        l2 = "";
                    } else {
                        ans = l2;
                        l1 = "";
                        l2 = "";
                    }
                } else {
                    l2 = newL2;
                }
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
