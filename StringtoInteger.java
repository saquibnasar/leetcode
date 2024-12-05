public class StringtoInteger {

    public static void main(String[] args) {
        String str = "0-1";

        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        str = str.replaceAll("\\s", "");
        int ans = 0;
        boolean isNegative = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                isNegative = true;
            } else if (ans == 0 && str.charAt(i) == '0') {
                if (str.charAt(i + 1) == '-') {
                    return 0;
                }
                continue;
            } else {
                if (ans == 0) {
                    ans = ans + str.charAt(i) - '0';
                } else {
                    ans = ans * 10 + str.charAt(i) - '0';
                }
            }
        }
        if (isNegative) {
            return -ans;
        }
        return ans;
    }

}