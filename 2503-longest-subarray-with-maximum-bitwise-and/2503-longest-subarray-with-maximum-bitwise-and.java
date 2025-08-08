class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,count=0,ans=0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        for(int num:nums){
            if(num==max){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}