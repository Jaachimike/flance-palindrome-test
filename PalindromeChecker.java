public class PalindromeChecker {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }


        return x == reversedHalf || x == reversedHalf / 10;
    }


    // Test cases
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        // Test case 1
        int x1 = 121;
        System.out.println("Input: " + x1);
        System.out.println("Output: " + checker.isPalindrome(x1));
        System.out.println("Expected: true\n");

        // Test case 2
        int x2 = -121;
        System.out.println("Input: " + x2);
        System.out.println("Output: " + checker.isPalindrome(x2));
        System.out.println("Expected: false\n");

        // Test case 3
        int x3 = 10;
        System.out.println("Input: " + x3);
        System.out.println("Output: " + checker.isPalindrome(x3));
        System.out.println("Expected: false\n");

        // Test case 4
        int x4 = 12321;
        System.out.println("Input: " + x4);
        System.out.println("Output: " + checker.isPalindrome(x4));
        System.out.println("Expected: true\n");

        // Test case 5
        int x5 = 0;
        System.out.println("Input: " + x5);
        System.out.println("Output: " + checker.isPalindrome(x5));
        System.out.println("Expected: true\n");
    }
}
