class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] arr = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!arr[i]){
                dfs(i, isConnected, arr);
                count++;
            }
        }
        return count;
    }
    private void dfs(int val, int[][] isConnected, boolean[] arr){
        arr[val] = true;
        for(int i = 0; i < isConnected.length; i++){
            if(!arr[i] && isConnected[val][i] == 1){
                dfs(i, isConnected, arr);
            }
        }
    }
}