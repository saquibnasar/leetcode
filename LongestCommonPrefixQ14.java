public class  LongestCommonPrefixQ14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    ˝
    public static String longestCommonPrefix(String[] strs) {
        String compareString = strs[0];
        String ans = "";
        int i = 0;
        while (i < compareString.length()) {
            for (int j = 1; j < strs.length; j++) {
                if(compareString.charAt(i) != strs[j].charAt(i)) {
                    return ans;
                }
        }
        ans = ans + compareString.charAt(i);
            i++;
        }
        return ans;
    }
}
