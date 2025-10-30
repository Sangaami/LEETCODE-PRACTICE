class Solution {
    public int earliestTime(int[][] tasks) {
        List<Integer> arr=  new ArrayList<>();
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i =0;i<tasks.length;i++){
            sum=0;
            for(int j=0;j<tasks[0].length;j++){
                sum+=tasks[i][j];
            }
            if(sum<min){
                min=sum;
            }  
            
            
        }
       
        return min;

    }
}