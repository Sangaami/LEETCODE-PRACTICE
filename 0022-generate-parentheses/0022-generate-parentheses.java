import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int total = 1 << (2 * n); // Total combinations = 2^(2n)

        for (int i = 0; i < total; i++) {
            StringBuilder s = new StringBuilder();
            int num = i;

            for (int j = 0; j < 2 * n; j++) {
                if ((num & 1) == 1)
                    s.append("(");
                else
                    s.append(")");
                num >>= 1;
            }

            if (isValid(s.toString())) {
                result.add(s.toString());
            }
        }

        return result;
    }

    private boolean isValid(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') count++;
            else count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}
