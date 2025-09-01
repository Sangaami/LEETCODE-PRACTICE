class Solution {
    public String convertToTitle(int num) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";

        while (num > 0) {
            num--;  
            int r = num % 26;
            res = s.charAt(r) + res;
            num /= 26;
        }

        return res;
    }
}
