import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int total = 1 << n; 
        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1)); 
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        System.out.println(sol.grayCode(n)); 
    }
}
