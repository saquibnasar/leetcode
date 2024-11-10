import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        int[] array = { 2, 9, 3 };
        int[] arrayTwo = { 5, 9, 4 };

        int[] ans = addTwoNumbers(array, arrayTwo);
        System.out.println(Arrays.toString(ans));
    }

    static int[] addTwoNumbers(int[] l1, int[] l2) {

        int[] ans = new int[l1.length];
        int extra = 0;

        for (int i = 0; i < l1.length; i++) {
            int a = l1[i];
            int b = l2[i];

            int sum = a + b + extra;
            extra = 0;
            if (sum < 10) {
                ans[i] = sum;
            } else {
                String convertToString = Integer.toString(sum);
                extra = 1;
                ans[i] = Integer.parseInt(convertToString.charAt(1) + "");
            }
        }
        return ans;
    }

}