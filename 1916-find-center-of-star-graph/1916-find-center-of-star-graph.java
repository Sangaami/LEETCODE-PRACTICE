import java.util.*;

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int center = 0;

        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[0].length; j++) {
                int node = edges[i][j];
                freqMap.put(node, freqMap.getOrDefault(node, 0) + 1);

                if (freqMap.get(node) > maxFreq) {
                    maxFreq = freqMap.get(node);
                    center = node;

                    if (maxFreq > 2) {
                        return center;
                    }
                }
            }
        }

        return center;
    }
}
