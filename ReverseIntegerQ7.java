public class ReverseIntegerQ7 {

    public static void main(String[] args) {

        int x = -2147483648;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int rev = 0;

        int INT_MIN = Integer.MIN_VALUE; // -2147483648
        int INT_MAX = Integer.MAX_VALUE; // 2147483647

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (rev > INT_MAX / 10 || rev == INT_MAX / 10 && digit >= INT_MAX % 10) {
                return 0;
            } else if (rev < INT_MIN / 10 || rev == INT_MIN / 10 && digit <= INT_MIN % 10) {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
    // public static int reverse(int x) {
    // int rev = 0;
    // long ifOutRange = 0L;

    // int INT_MIN = Integer.MIN_VALUE; // -2147483648
    // int INT_MAX = Integer.MAX_VALUE; // 2147483647

    // while (x != 0) {
    // rev = rev * 10 + x % 10;
    // ifOutRange = (ifOutRange * 10 + x % 10) * 1L;
    // x = x / 10;
    // if (ifOutRange > INT_MAX || ifOutRange < INT_MIN) {
    // return 0;
    // }

    // }
    // return rev;
    // }
}
