class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String[] arr=new String[words.size()];
        String res="";
        for(int i=0;i<words.size();i++){
            arr[i]=words.get(i);
        }
        for(String ch:arr){
            res+=ch.charAt(0);
        }
        if(res.equals(s)) return true;
        else return false;
    }
}