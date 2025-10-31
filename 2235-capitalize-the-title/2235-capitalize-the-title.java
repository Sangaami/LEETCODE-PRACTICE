class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String[] s=title.split(" ");
        String res="";
        for(String i:s){
            int k=i.length();
            if(k>2){
               res+=(Character.toUpperCase(i.charAt(0)))+(i.substring(1))+" ";
            }
            else{
                res+=i+" ";
            }
        }
        return res.trim();
    }
}