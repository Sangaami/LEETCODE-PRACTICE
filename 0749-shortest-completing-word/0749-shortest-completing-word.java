class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        

        int[] licensehash = new int[26];
        for(char c : licensePlate.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                licensehash[c - 'a']++;
            }
        }
        String choseword = "";

        for(String word : words){
            int[] wordhash = new int[26];
            for(char c : word.toCharArray()){
                wordhash[c- 'a'] ++;
            }
            boolean iscompleted = true;
            for(int i=0;i<26;i++){
                if(wordhash[i] < licensehash[i]){
                    iscompleted = false;
                    break;
                }
            }

            if( iscompleted && (choseword == "" || choseword.length() > word.length())){
                choseword = word;
            }

        }

        return choseword;
    }
}