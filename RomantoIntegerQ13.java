import java.util.HashMap;

public class RomantoIntegerQ13 {
    public static void main(String[] args) {
        String roman = "MCMXCIV";

        System.out.println(romanToInt(roman));

    }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('M', 1000);
        roman.put('D', 500);
        roman.put('C', 100);
        roman.put('L', 50);
        roman.put('X', 10);
        roman.put('V', 5);
        roman.put('I', 1);

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                result = result + roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                i++;
            } else {
                result += roman.get(s.charAt(i));
            }
        }

        return result;
    }
    // public static int romanToInt(String s) {
    // if (s.length() == 0)
    // return 0;
    // int ans = 0;
    // for (int i = 0; i < s.length(); i++) {
    // char c = s.charAt(i);
    // int value = 0;
    // if (c == 'I') {
    // if (i + 1 < s.length()) {
    // c = s.charAt(i + 1);
    // if (c == 'V') {
    // value = 4;
    // i++;
    // } else if (c == 'X') {
    // value = 9;
    // i++;
    // } else {
    // value = 1;
    // }
    // } else {
    // value = 1;
    // }

    // } else if (c == 'V') {
    // value = 5;
    // } else if (c == 'X') {
    // if (i + 1 < s.length()) {
    // c = s.charAt(i + 1);
    // if (c == 'L') {
    // value = 40;
    // i++;
    // } else if (c == 'C') {
    // value = 90;
    // i++;
    // } else {
    // value = 10;
    // }
    // } else {
    // value = 10;
    // }

    // } else if (c == 'L') {
    // value = 50;
    // } else if (c == 'C') {
    // if (i + 1 < s.length()) {
    // c = s.charAt(i + 1);
    // if (c == 'D') {
    // value = 400;
    // i++;
    // } else if (c == 'M') {
    // value = 900;
    // i++;
    // } else {
    // value = 100;
    // }
    // } else {
    // value = 100;
    // }
    // } else if (c == 'D') {
    // value = 500;
    // } else if (c == 'M') {
    // value = 1000;
    // }
    // ans += value;
    // }
    // return ans;
    // }
}
