public class ValidParenthesesQ20 {
    public static void main(String[] args) {
        String s = "([])";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) == '(') {
                    if (s.charAt(j) == ')') {
                        break;
                    } else if (s.charAt(j) == '}') {
                        return false;
                    } else if (s.charAt(j) == ']') {
                        return false;

                    }
                } else if (s.charAt(i) == '{') {
                    if (s.charAt(j) == ')') {
                        break;
                    } else if (s.charAt(j) == '}') {
                        break;
                    } else if (s.charAt(j) == ']') {
                        return false;
                    }
                }

                else if (s.charAt(i) == '[') {
                    if (s.charAt(j) == ')') {
                        break;
                    } else if (s.charAt(j) == '}') {
                        break;
                    } else if (s.charAt(j) == ']') {
                        break;
                    }
                }
            }
        }
        return true;
    }
}
