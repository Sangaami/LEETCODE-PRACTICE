class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         Arrays.sort(nums);
         int max=nums[nums.length-1];
       int[] a= new int[max+1];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
        }
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(a[nums[i]]==2){
                arr.add(nums[i]);
                a[nums[i]]=0;
            }
        }
        return arr;
    }
}