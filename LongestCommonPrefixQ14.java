public class LongestCommonPrefixQ14 {
    public static void main(String[] args) {
        String[] strs = { "flower", "fkow", "" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String compareString = strs[0];
        String ans = "";
        int stringIndex = 0;
        while (stringIndex < compareString.length()) {
            for (int arrayIndex = 0; arrayIndex < strs.length; arrayIndex++) {
                if (strs[arrayIndex].length() == 0
                        || compareString.charAt(stringIndex) != strs[arrayIndex].charAt(stringIndex)) {
                    return ans;
                }
                if (compareString.length() > strs[arrayIndex].length()) {
                    compareString = strs[arrayIndex];
                }
            }
            ans = ans + compareString.charAt(stringIndex);
            stringIndex++;
        }
        return ans;
    }
}
