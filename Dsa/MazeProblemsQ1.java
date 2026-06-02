package Dsa;

class Student {
    String name;
    int rollno;

    // public Student(String name, int rollno) {
    // this.name = name;
    // this.rollno = rollno;
    // }

    public Student() {
        // this.color = color;
        // this.brand = brand;
    }

    public void printValue() {
        System.out.println("Name: " + name + " Roll no: " + rollno);
    }

    public Student(Student s) {
        this.name = s.name;
        this.rollno = s.rollno;
    }

}

public class MazeProblemsQ1 {

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(findPath(3, 3, ""));
    }

    public static String[] findPath(int r, int c, String p) {

        if (r == 1 && c == 1) {

            System.out.println(p);
            return new String[] { p };
        }
        if (r == 1 || c == 1) {
            return new String[] { p };
        }
        if (r > 1) {
            String[] right = findPath(r - 1, c, p + "R");
        }

        String[] left = findPath(r, c - 1, p + "L");

        return new String[] { left[0] };
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
