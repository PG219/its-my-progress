Pakage Strings;
public class StringCheck {

    public static boolean palindrome() {
        String s1 = "abccba";
        int n = s1.length();
        for (int i = 0; i < n / 2; i++) {
            if (s1.charAt(i) != s1.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean symmetrical() {
        String s1 = "manma";
        int n = s1.length();
        int m = n / 2;

        if (n % 2 == 0) {
            for (int i = 0; i < m; i++) {
                if (s1.charAt(i) != s1.charAt(i + m)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < m; i++) {
                if (s1.charAt(i) != s1.charAt(i + m + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome() + ", " + symmetrical());
    }
}
