class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n =words.size();
        if(n!=s.length()) return false;
        int k =0;
        for(String t:words){
            if(t.charAt(0)!=s.charAt(k)){
                return false;
            }
            k++;
        }
        return true;
    }
}