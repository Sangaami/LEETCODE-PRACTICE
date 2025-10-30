class Solution {
    public int earliestTime(int[][] tasks) {
        List<Integer> arr=  new ArrayList<>();
        int sum=0;
        for(int i =0;i<tasks.length;i++){
            sum=0;
            for(int j=0;j<tasks[0].length;j++){
                sum+=tasks[i][j];
               
            }
             arr.add(sum);
        }
        Collections.sort(arr);
        sum=arr.get(0);
        return sum;

    }
}