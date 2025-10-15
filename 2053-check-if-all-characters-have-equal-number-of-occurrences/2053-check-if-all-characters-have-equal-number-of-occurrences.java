class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] ch = s.toCharArray();
        int[] f = new int[26];
        
        // Count frequency of each character
        for (int i = 0; i < ch.length; i++) {
            f[ch[i] - 'a']++;
        }

        // Find the first non-zero frequency
        int firstFreq = 0;
        for (int i = 0; i < 26; i++) {
            if (f[i] != 0) {
                firstFreq = f[i];
                break;
            }
        }

        // Compare all non-zero frequencies with firstFreq
        for (int i = 0; i < 26; i++) {
            if (f[i] != 0 && f[i] != firstFreq) {
                return false;
            }
        }

        return true;
    }
}
