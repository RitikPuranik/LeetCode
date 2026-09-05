class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        for (int[] pre : prerequisites) adj.get(pre[1]).add(pre[0]);

        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i] && dfs(i, vis, path, adj)) return false;
        }

        return true;
    }

    private boolean dfs(int node, boolean[] vis, boolean[] path, List<List<Integer>> adj) {
        vis[node] = true;
        path[node] = true;

        for (int next : adj.get(node)) {
            if (path[next]) return true;
            if (!vis[next] && dfs(next, vis, path, adj)) return true;
        }

        path[node] = false;
        return false;
    }
}
