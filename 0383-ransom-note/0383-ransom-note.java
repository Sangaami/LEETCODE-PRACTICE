class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] f = new int[256];
        for (int i = 0; i < magazine.length(); i++) {
            f[magazine.charAt(i)]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--f[ransomNote.charAt(i)] < 0) {
                return false; 
            }
        }

        return true;
    }
}
