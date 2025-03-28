package Dsa;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = i; j < (i * 2) + n; j++) {
                if (j >= n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}