public class FindtheIndexoftheFirstOccurrenceinaStringQ28 {

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;

        for (int i = 0; i < haystack.length() - (needle.length() - 1); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() <= haystack.length() - i
                        && haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }

            }

        }

        return -1;
    }
}
