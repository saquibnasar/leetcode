public class DivideTwoIntegersQ29 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));

    }

    public static int divide(int dividend, int divisor) {
        int ans = 0;
        int extraValue = 0;

        int currentPointer = 0;
        String dividendStr = String.valueOf(dividend);

        while (currentPointer < dividendStr.length()) {
            int currentMath = Integer.parseInt(dividendStr.substring(currentPointer, currentPointer));
            if (extraValue == 0) {
                currentMath = Integer.parseInt(dividendStr.substring(currentPointer, currentPointer + 1));
            }

            while (currentMath < divisor) {

            }
        }

        return dividend / divisor;
    }

}
