package Assignment8;

public class PallindromeChecker {

    public static boolean isPalindrome(String str) {
        int length = str.length();
        char[] reverse = new char[length];
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = str.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != reverse[i]) {
                return false;
            }
        }
        return true;
    }
}
