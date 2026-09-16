class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        boolean[] check =  new boolean[n];
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!vis[i]) dfs(i, graph, vis, path, check);
        }
        for(int i = 0; i < n; i++){
            if(check[i]) res.add(i);
        }

        return res;
    }

    private boolean dfs(int node, int[][] graph, boolean[] vis, boolean[] path, boolean[] check) {
        vis[node] = true;
        path[node] = true;

        for (int i : graph[node]) {
            if(path[i]) return true;
            if (!vis[i] && dfs(i, graph, vis, path, check)) return true;
        }

        path[node] = false;
        check[node] = true;
        return false;
    }
}
