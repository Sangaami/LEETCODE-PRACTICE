class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        int cycleLen = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = 0; j + row < s.length(); j += cycleLen) {
                result.append(s.charAt(j + row)); // vertical

                // diagonal element, skip first and last row
                if (row != 0 && row != numRows - 1 && j + cycleLen - row < s.length()) {
                    result.append(s.charAt(j + cycleLen - row)); // diagonal
                }
            }
        }

        return result.toString();
    }
}