class Solution {
    public String replaceDigits(String s) {
        char[] c = s.toCharArray();
        String st = "";
        
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                // Shift the previous character by digit
                char shifted = (char)(c[i - 1] + (c[i] - '0'));
                st += shifted;
            } else {
                st += c[i];
            }
        }
        
        return st;
    }
}
