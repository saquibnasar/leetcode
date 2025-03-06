public class DivideTwoIntegersQ29 {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        String test = String.valueOf(-1);
        System.out.println(test);
        System.out.println(divide(dividend, divisor));

    }

    public static int divide(int dividend, int divisor) {
        int maxInt = 2147483647;
        int minInt = -2147483648;

        int ans = 0;
        int extraValue = 0;
        int originalDivisor = divisor;
        int originalDividend = dividend;
        // if (dividend == minInt) {
        // dividend = maxInt;
        // }
        // if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 || dividend <
        // 0 && divisor < 0) {
        // // find way to make it positive without changing the sign
        // divisor = Math.abs(divisor);
        // dividend = Math.abs(dividend);
        // }
        divisor = Math.abs(divisor);
        int currentPointer = 0;
        if (dividend < 0) {
            currentPointer = 1;
        }
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
                // if (ans++ >= 10) {
                // ans = ans*1
                // }
                if (currentMath - divisor < 0) {
                    extraValue = currentMath;
                    break;
                }

            }
            if (extraValue > 0) {
                currentPointer += 1;
            } else {
                currentPointer += 2;

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
