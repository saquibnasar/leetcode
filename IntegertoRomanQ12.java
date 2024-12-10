public class IntegertoRomanQ12 {
    public static void main(String[] args) {
        int num = 3749;
          
        System.out.println(intToRoman(num));

    }
    public static String intToRoman(int num) {
        String ans = "";

        if(num == 0) {
            return "";
        }


        // String[] roman = new String[]{"I","V","X","L","C","D","M"};
        String[] roman = new String[]{"I","II","II","III","IV","V","VI","VII","VIII","IX"};
        int test = 1;
        while (test==0) {
        int numTest = num % 10;
        if (numTest == 0) {
            test = test*10;
        }

    }
    ans = ans+ roman[test];

        String ans2 = intToRoman(num/10  * 10);

        // I	1
        // V	5
        // X	10
        // L	50
        // C	100
        // D	500
        // M	1000





        return intToRoman(num);
    }
}