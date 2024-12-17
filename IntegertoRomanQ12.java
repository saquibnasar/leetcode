public class IntegertoRomanQ12 {
    public static void main(String[] args) {
        int num = 104506;
        System.out.println(intToRoman(num ));

    }
    public static String intToRoman(int num) {
        String ans = "";
      

        return ans;
    }

    // public static String intToRoman(int num) {
    //     String ans = "";
    //     if (num <= 0) {
    //         return "";
    //     }
    //     // I 1
    //     // V 5
    //     // X 10
    //     // L 50
    //     // C 100
    //     // D 500
    //     // M 1000

    //     // String[] roman = new String[]{"I","V","X","L","C","D","M"};

    //     // minus until num is less than 1000
    //     // then 500
    //     // then 100
    //     while (num > 0) {
    //         if (num > 1000) {
    //             num = num - 1000;
    //             ans = ans + "M";
    //         } else if (num >= 900) {
    //             num = num - 900;
    //             ans = ans + "CM";
    //         } else if (num > 500) {
    //             num = num - 500;
    //             ans = ans + "D";
    //         } else if (num >= 400) {
    //             num = num - 400;
    //             ans = ans + "CD";
    //         } else if (num > 100) {
    //             num = num - 100;
    //             ans = ans + "C";
    //         } else if (num >= 90) {
    //             num = num - 90;
    //             ans = ans + "XC";
    //         } else if (num > 50) {
    //             num = num - 50;
    //             ans = ans + "L";
    //         } else if (num >= 40) {
    //             num = num - 40;
    //             ans = ans + "XL";
    //         } else if (num > 10) {
    //             num = num - 10;
    //             ans = ans + "X";
    //         }
    //         else if (num >= 9) {
    //             num = num - 9;
    //             ans = ans + "IX";
    //         } else if (num > 5) {
    //             num = num - 5;
    //             ans = ans + "V";
    //         }
    //          else if (num >= 4) {
    //             num = num - 4;
    //             ans = ans + "IV";
    //         } else if (num > 1) {
    //             num = num - 1;
    //             ans = ans + "I";
    //         }

    //     }

    //     return ans;
    // }
}
