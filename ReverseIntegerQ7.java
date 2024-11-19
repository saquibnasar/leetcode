public class ReverseIntegerQ7 {

    public static void main(String[] args) {

        int x = 123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }
}
