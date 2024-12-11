public class StringtoIntegerQ8 {

    public static void main(String[] args) {
        String str = "21474836460";
        System.out.println(myAtoi(str));
    }
// my solution for this problem
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int INT_MIN = Integer.MIN_VALUE; // -2147483648
        int INT_MAX = Integer.MAX_VALUE; // 2147483647
        // ' ' 32
        // 45 - to 43 +
        // 48 to 58 0 to 9
        // 65 to 90 A to Z
        // 97 to 122 a to z
        int ans = 0;
        long ifOutRange = 0L;
        boolean isNeg = str.charAt(0) == 45;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 || str.charAt(i) <= 47 && str.charAt(i) != 43 && str.charAt(i) != 45) {
                if (isNeg) {
                    return ans * -1;
                }
                return ans;
            }

            if (ans != 0 &&  (str.charAt(i) == 43 || str.charAt(i) == 45)) {
                if (str.charAt(i) == 43 || str.charAt(i) == 45) {
                    if (isNeg) {
                        return ans * -1;
                    }
                    return ans;
                }
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 58) {
                // check if out of range of 32 bit integer
                ifOutRange = (ifOutRange * 10 + str.charAt(i) - '0') * 1L;
                if (isNeg) {
                    if (ifOutRange * -1L < INT_MIN) {
                        return INT_MIN;
                    }
                } else {
                    if (ifOutRange > INT_MAX) {
                        return INT_MAX;
                    }
                }

                if (ans == 0) {
                    ans = ans + str.charAt(i) - '0';
                } else {
                    ans = ans * 10 + str.charAt(i) - '0';
                }
            }
            if (str.charAt(i) == 48 || str.charAt(i) == 43 || str.charAt(i) == 45) {
                if (str.length() <= i + 1) {
                    if (isNeg) {
                        return ans * -1;
                    }
                    return ans;
                }
                if (str.charAt(i + 1) == 43 || str.charAt(i + 1) == 45) {
                    if (isNeg) {
                        return ans * -1;
                    }
                    return ans;
                }
            }
        }
        if (str.charAt(0) == '-') {
            ans = ans * -1;
        }

        return ans;
    }

    // best solution for this problem
    public int myAtoi2(String s) {
        char[] characters = s.toCharArray();
        Integer result = null;
        boolean isPositive = true, wasPositive = true, isSignPossible = true;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' ') {
                if (result == null && isSignPossible) {
                    continue;
                } else
                    break;
            } else if (characters[i] >= '0' && characters[i] <= '9') {
                int newDigit = characters[i] - '0';
                int oldValue = result == null ? 0 : result;

                if (result == null) {
                    if (newDigit == 0) {
                        isSignPossible = false;
                        continue;
                    }
                    result = isPositive ? newDigit : -newDigit; 
                } else {
                    result *= 10;
                    result = isPositive ? result + newDigit : result - newDigit;
                }
                isSignPossible = false;

                // If the old value divided by 10 does not equal to the new value, it is an Overflow or an Underflow!
                if (result / 10 != oldValue) { 
                    return wasPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else if (characters[i] == '-') {
                if (result == null && isSignPossible) {
                    isPositive = false;
                    wasPositive = false;
                    isSignPossible = false;
                } else
                    break;
            } else if (characters[i] == '+' && isSignPossible) {
                if (result == null) {
                    isPositive = true;
                    wasPositive = true;
                    isSignPossible = false;
                } else
                    break;
            } else 
                break;
        }

        if (result == null) {
            result = 0;
        }

        return result;
    }

}
