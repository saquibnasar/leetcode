public class DivideTwoIntegersQ29 {
    public static void main(String[] args) {
        int dividend = 2147483647;
        int divisor = 1;

        System.out.println(divide(dividend, divisor));

    }

    public static int divide(int dividend, int divisor) {
        int maxInt = 2147483647;
        int minInt = -2147483648;

        int ans = 0;
        String extraValue = "";
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
            if (extraValue.length() <= 0 && currentPointer + 1 < dividendStr.length()) {
                currentMath = Integer.parseInt(dividendStr.substring(currentPointer, currentPointer + 2) + extraValue);
            }
            int currentans = 0;
            boolean isNegative = true;
            while (currentMath >= divisor) {

                currentMath = currentMath - divisor;
                currentans++;
                ans++;
                if (currentans + 1 > 10 && isNegative && currentPointer > 0) {
                    String temp = String.valueOf(ans);
                    temp = temp + "0";
                    ans = Integer.parseInt(temp);
                    isNegative = false;
                }
                if (currentMath - divisor < 0 && currentMath % divisor == 1) {
                    String temp = String.valueOf(currentMath);
                    extraValue = temp;
                    break;
                }

            }
            if (extraValue.length() > 0) {
                currentPointer += 1;
            } else {
                currentPointer += 2;

            }
            if (currentPointer < dividendStr.length()) {
                String temp = String.valueOf(ans);
                temp = temp + "0";
                ans = Integer.parseInt(temp);
            }

        }

        if (originalDividend < 0 && originalDivisor > 0 || originalDividend > 0 && originalDivisor < 0) {
            ans = -ans;
        }

        return ans;
    }

}
