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
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == '(' && s.charAt(j) == ')') {
                    break;
                } else if (s.charAt(i) == '{' && s.charAt(j) == '}') {
                    break;
                } else if (s.charAt(i) == '[' && s.charAt(j) == ']') {
                    break;
                } else if (s.charAt(i) == '(' && s.charAt(j) == '}') {
                    for (int a = i + 1; a < j; a++) {
                        if (s.charAt(a) == '{') {
                            continue;
                        }
                    }
                    return false;

                } else if (s.charAt(i) == '(' && s.charAt(j) == ']') {
                    for (int a = i; a < j; a++) {
                        if (s.charAt(a) == '[') {
                            continue;
                        }
                    }
                    return false;
                } else if (s.charAt(i) == '[' && s.charAt(j) == '}') {
                    for (int a = i; a < j; a++) {
                        if (s.charAt(a) == '{') {
                            continue;
                        }

                    }
                    return false;
                } else if (s.charAt(i) == '[' && s.charAt(j) == ')') {
                    for (int a = i; a < j; a++) {
                        if (s.charAt(a) == '(') {
                            continue;
                        }

                    }
                    return false;
                } else if (s.charAt(i) == '{' && s.charAt(j) == ']') {
                    for (int a = i; a < j; a++) {
                        if (s.charAt(a) == '[') {
                            continue;
                        }

                    }
                    return false;

                } else if (s.charAt(i) == '{' && s.charAt(j) == ')') {
                    for (int a = i; a < j; a++) {
                        if (s.charAt(a) == '(') {
                            continue;
                        }
                    }
                    return false;
                }

            }

        }

        return true;
    }
    // public static boolean isValid(String s) {
    // int findPoint = 0;
    // if (s.length() == 0) {
    // return true;
    // }
    // boolean ans = true;
    // for (int i = 0; i < s.length(); i++) {

    // for (int j = i + 1; j < s.length(); j++) {
    // if (s.charAt(i) == '(') {
    // if (s.charAt(j) == ')') {
    // ans = true;
    // break;
    // }
    // } else if (s.charAt(i) == '{') {
    // if (s.charAt(j) == '}') {
    // ans = true;
    // break;
    // }
    // } else if (s.charAt(i) == '[') {
    // if (s.charAt(j) == ']') {
    // ans = true;
    // break;
    // }
    // } else {
    // break;
    // }
    // ans = false;
    // }
    // if (!ans) {
    // break;
    // }

    // }
    // return ans;
    // }
}
