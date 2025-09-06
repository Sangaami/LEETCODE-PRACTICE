class Solution {
    public int maxNumberOfBalloons(String text) {
        char ch[]=text.toCharArray();
        int f[]=new int[26];
        for(char c:ch){
            f[c-'a']++;
        }
        String res="balloon";
        char []p=res.toCharArray();
        int f2[]=new int[26];
        for(int i=0;i<p.length;i++){
            f2[p[i]-'a']++;
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
           if(f2[i]>0){
            max=Math.min(max,f[i]/f2[i]);
           }
        }
        return max;
    }
}