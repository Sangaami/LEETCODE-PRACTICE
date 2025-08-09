class Solution {
    static class Pair {
        int node, time;
        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] edge : times) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2])); 
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.time));
        pq.add(new Pair(k, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            int timeSoFar = curr.time;

            if (timeSoFar > dist[u]) continue;

            for (Pair nei : adj.get(u)) {
                int v = nei.node;
                int w = nei.time;
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1; 
            maxTime = Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}
