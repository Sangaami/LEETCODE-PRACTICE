import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the integer
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number is equal to its reverse
        return original == reversed;
    }


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int param_1 = sc.nextInt();

        Solution solution = new Solution();
        boolean ret = solution.isPalindrome(param_1);

        System.out.println("Is the number a palindrome? " + ret);

        sc.close();
    }
}
}
