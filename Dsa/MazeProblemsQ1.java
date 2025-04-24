package Dsa;

public class MazeProblemsQ1 {

    public static void main(String[] args) {

        System.out.println(findPathcount(3, 3));
    }

    public static int findPath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = findPath(r - 1, c);

        int left = findPath(r, c - 1);
        return 1;
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
