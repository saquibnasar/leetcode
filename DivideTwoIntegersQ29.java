public class DivideTwoIntegersQ29 {
    public static void main(String[] args) {
        int dividend = -1021989372;
        int divisor = -82778243;

        System.out.println(divideFirstTwoDigits(dividend, divisor));

    }

    public static int divide(int dividend, int divisor) {
        return 0;
    }

    // i tried to solve this problem using the concept of taking first two digits
    // then subtracting them from the dividend and dividing the result by the
    // divisor and adding 1 to the answer

    public static int divideFirstTwoDigits(int dividend, int divisor) {
        if ((dividend <= Integer.MIN_VALUE) && (divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        if (dividend < 0 && divisor < 0 && divisor < dividend) {
            return 0;
        }
        if (dividend < 0 && divisor > 0 && Math.abs(dividend) < divisor && dividend == Integer.MAX_VALUE) {
            return 0;
        }

        int ans = 0;
        String extraValue = "";
        int originalDivisor = divisor;
        int originalDividend = dividend;

        divisor = Math.abs(divisor);
        int currentPointer = 0;
        if (dividend < 0) {
            currentPointer = 1;
        }
        String dividendStr = String.valueOf(dividend);

        while (currentPointer < dividendStr.length()) {
            int currentMath = 0;
            int pointer = 0;
            while (currentMath < divisor) {
                currentMath = Integer.parseInt(extraValue +
                        dividendStr.substring(currentPointer, currentPointer + 1 + pointer));
                if (extraValue.length() <= 0 && currentPointer + 1 < dividendStr.length()) {
                    currentMath = Integer.parseInt(dividendStr.substring(currentPointer,
                            currentPointer + 2 + pointer));

                }
                if (currentMath < divisor) {
                    pointer++;
                }
            }
            currentPointer = currentPointer + pointer;
            if (extraValue.length() <= 0 && currentPointer + 1 < dividendStr.length()) {

                currentPointer++;
            }

            int currentans = 0;
            boolean isNegative = true;
            while (currentMath >= divisor) {

                currentMath = currentMath - divisor;
                currentans++;
                ans++;
                if (currentMath - divisor < divisor && currentMath - divisor > 0) {
                    currentMath = currentMath - divisor;
                    ans++;
                    String temp = String.valueOf(currentMath);
                    extraValue = temp;
                    break;
                } else {
                    extraValue = "";
                }
                if (currentans + 1 > 9 && isNegative && currentPointer > 1) {
                    String temp = String.valueOf(ans);
                    String temp2 = temp.substring(temp.length() - 1, temp.length());
                    temp = temp.substring(0, temp.length() - 1);
                    temp = temp + "0" + temp2;
                    ans = Integer.parseInt(temp);
                    isNegative = false;
                }

            }
            currentPointer++;
            if (currentPointer < dividendStr.length()) {
                String temp = String.valueOf(ans);
                temp = temp + "0";
                ans = Integer.parseInt(temp);
            }

        }

        if (originalDividend < 0 && originalDivisor > 0 || originalDividend > 0 &&
                originalDivisor < 0) {
            ans = -ans;
        }

        return ans;
    }

}
