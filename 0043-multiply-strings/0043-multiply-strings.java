class Solution {
    public String multiply(String num1, String num2) {
        // If either of the numbers is "0", the result is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();

        // The maximum possible length of the result is len1 + len2
        int[] result = new int[len1 + len2];

        // Multiply each digit of num1 by each digit of num2
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                // Get the digit values
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                // Multiply the digits and add to the corresponding position in result
                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];

                // Carry over to the next position
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && i == 0)) {
                sb.append(i);
            }
        }

        return sb.toString();
    }
}
