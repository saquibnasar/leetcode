package Dsa;

public class MazeProblemsQ1 {

    public static void main(String[] args) {

        System.out.println(findPath(3, 3, ""));
    }

    public static String[] findPath(int r, int c, String p) {
        if (r == 1 || c == 1) {
            return new String[] { p };
        }

        String[] right = findPath(r - 1, c, p + "R");

        String[] left = findPath(r, c - 1, p + "D");
        System.out.println(right[0] + " " + left[0]);
        return new String[] { right[0], left[0] };
    }

    public static int findPathcount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int count = findPathcount(r - 1, c);

        int countR = findPathcount(r, c - 1);
        return count + countR;
    }
}
