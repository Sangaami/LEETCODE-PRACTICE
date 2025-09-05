class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for (char ch : s.toCharArray()) {
            freqS[ch - 'a']++;
        }
        for (char ch : target.toCharArray()) {
            freqT[ch - 'a']++;
        }
        int result = Integer.MAX_VALUE;
        for (char ch : target.toCharArray()) {
            int idx = ch - 'a';
            result = Math.min(result, freqS[idx] / freqT[idx]);
        }
        return result;
    }
}
