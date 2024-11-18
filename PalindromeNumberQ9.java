public class PalindromeNumberQ9 {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int original = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if (rev == original) {
            return true;
        }
        return false;
    }
}
