public class DivideTwoIntegersQ29 {
    public static void main(String[] args) {
        int dividend = -2147483647;
        int divisor = -1;
        System.out.println(divide(dividend, divisor));

    }

    public static int divide(int dividend, int divisor) {
        int ans = 0;
        int extraValue = 0;
        int originalDivisor = divisor;
        int originalDividend = dividend;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 || dividend < 0 && divisor < 0) {
            // find way to make it positive without changing the sign
            divisor = Math.abs(divisor);
            dividend = Math.abs(dividend);
        }
        int currentPointer = 0;
        String dividendStr = String.valueOf(dividend);

        while (currentPointer < dividendStr.length()) {
            int currentMath = Integer.parseInt(dividendStr.substring(currentPointer, currentPointer + 1));
            if (extraValue <= 0 && currentPointer + 1 < dividendStr.length()) {
                currentMath = Integer.parseInt(dividendStr.substring(currentPointer, currentPointer + 2));
            }
            if (extraValue > 0) {
                currentMath = extraValue * 10 + currentMath;
            }

            while (currentMath >= divisor) {
                currentMath = currentMath - divisor;
                ans++;
                if (currentMath - divisor < 0) {
                    extraValue = currentMath;
                    break;
                }

            }
            if (extraValue > 0) {
                currentPointer += 2;
            } else {
                currentPointer += 3;
            }
            if (currentPointer < dividendStr.length()) {
                ans = ans * 10;
            }

        }

        if (originalDividend < 0 && originalDivisor > 0 || originalDividend > 0 && originalDivisor < 0) {
            ans = -ans;
        }

        return ans;
    }

}
