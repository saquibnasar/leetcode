public class PalindromeNumberQ9 {

    public static void main(String[] args) {
        int x = 1874994781;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int div = 1;

        while (x >= 10 * div && x < 1000000000) {
            div = div * 10;
        }
        if (x > 1000000000) {
            div = 1000000000;
        }

        while (x > 0) {
            if (x % 10 != x / div) {
                return false;
            }
            x = (x % div) / 10;
            div = div / 100;
        }

        return true;
    }

    // public static boolean isPalindrome(int x) {
    // if (x < 0) {
    // return false;
    // }
    // int rev = 0;
    // int original = x;
    // while (x > 0) {
    // rev = rev * 10 + x % 10;
    // x = x / 10;
    // }
    // if (rev == original) {
    // return true;
    // }
    // return false;
    // }
}
