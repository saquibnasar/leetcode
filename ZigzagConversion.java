public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(ZigzagConversionAns(s, 4));
    }

    public static String ZigzagConversionAns(String s, int n) {
        int originalLenth = s.length();
        String ans = s.charAt(0) + "";
        String st = "";
        int originalOrder = n + n - 3;
        int sOrder = n + n - 3;
        int i = 1;
        boolean testBol = false;
        while (ans.length() < originalLenth) {
            if (sOrder == -1) {
                ans = ans + s.substring(i, s.length());
                return ans;
            }
            if (sOrder == 0) {
                char test = s.charAt(i);
                ans += test;
                if (testBol && !(i + originalOrder >= s.length())) {
                    char test2 = s.charAt(i + 1);
                    ans += test2;
                    i++;
                }
                sOrder = originalOrder + 1;
                if (i + originalOrder >= s.length()) {
                    testBol = true;
                    originalOrder = originalOrder - 2;
                    sOrder = originalOrder + 1;
                    ans = ans + st.charAt(0);
                    s = st + s.substring(i + 1, s.length());
                    st = "";
                    i = 0;
                }
            } else {
                st = st + s.charAt(i);
            }
            sOrder = sOrder - 1;
            i++;
        }
        return ans;
    }

}
