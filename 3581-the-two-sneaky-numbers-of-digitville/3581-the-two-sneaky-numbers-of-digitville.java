class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] a= new int[nums.length];
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
        int [] org= new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            org[i]=arr.get(i);
        }
        return org;
    }
}