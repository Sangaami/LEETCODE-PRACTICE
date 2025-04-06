class Solution {
    public int reverse(int x) {
        long result = 0; // Using long to handle potential overflow
        
        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit
            
            result = result * 10 + digit; // Form the reversed number
        }
        
        // Check if result is within the 32-bit integer range
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) result; // Cast to int and return the result
    }
}
