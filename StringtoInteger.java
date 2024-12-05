public class StringtoInteger {

    public static void main(String[] args) {
        String str = " -042";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        str = str.replaceAll("\\s", "");
        // 48 to 58 0 to 9
        // 65 to 90 A to Z
        // 97 to 122 a to z
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if (0 + str.charAt(i) >= 65) {
                return ans;
            }
            if (ans == 0 && str.charAt(i) == '0' && (str.charAt(i + 1) == '-' || str.charAt(i + 1) == '+')) {
                return 0;
            } else if (0 + str.charAt(i) >= 48 && 0 + str.charAt(i) <= 57) {
                if (ans == 0) {
                    ans = ans + str.charAt(i) - '0';
                } else {
                    ans = ans * 10 + str.charAt(i) - '0';
                }
            }
        }
        if (str.charAt(0) == '-') {
            return -ans;
        }
        return ans;
    }

}