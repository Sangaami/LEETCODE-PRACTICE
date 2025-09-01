class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String s = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();

        long n = num & 0xFFFFFFFFL;
        while (n != 0) {
            sb.append(s.charAt((int)(n % 16)));
            n /= 16;
        }

        return sb.reverse().toString();
    }
}
