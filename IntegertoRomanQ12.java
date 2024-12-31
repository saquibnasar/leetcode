import java.util.LinkedHashMap;
import java.util.Map;

public class IntegertoRomanQ12 {
    public static void main(String[] args) {
        int num = 4506;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        String ans = "";
        LinkedHashMap<String, Integer> roman = new LinkedHashMap<>();
        roman.put("M", 1000);
        roman.put("CM", 900);
        roman.put("D", 500);
        roman.put("CD", 400);
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);

        for (Map.Entry<String, Integer> set : roman.entrySet()) {
            if (num / set.getValue() > 0) {
                int count = num / set.getValue();
                for (int i = 0; i < count; i++) {
                    ans = ans + set.getKey();
                }
                num = num % set.getValue();
            }
        }

        return ans;
    }

}
