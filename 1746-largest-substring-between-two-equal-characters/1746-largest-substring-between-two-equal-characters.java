class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
      char[] ch=s.toCharArray();
      int max=-1;
      for(int i=0;i<ch.length-1;i++){
      for(int j=i+1;j<ch.length;j++){
        if(ch[i]==ch[j]){
            String res=s.substring(i,j);
            int n =res.length()-1;
            if(n>max){
                max=n;
            }
        }
      }
      }
      return max;
    }
}