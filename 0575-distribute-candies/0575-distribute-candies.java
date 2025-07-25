class Solution {
    public int distributeCandies(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);

        if(set.size()>=nums.length/2){
            return nums.length/2;
        }
    return set.size();
    }
}