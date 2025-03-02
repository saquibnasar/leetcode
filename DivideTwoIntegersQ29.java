public class DivideTwoIntegersQ29 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));

    }

    public static int divide(int dividend, int divisor) {
        int ans = 0;
        int newDivisor = divisor;

        if (newDivisor < 0) {
            newDivisor = -divisor;
        }
        while (dividend >= divisor) {

            if (newDivisor > dividend) {
                return ans;
            } else {
                newDivisor = newDivisor + newDivisor;
                ans++;
                if (newDivisor > dividend) {
                    if (divisor < 0) {
                        return -ans;
                    }

                }

            }

        }

        return dividend / divisor;
    }

}
