class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        find(n, 0, 0, sb);
        return res;
    }
    private void find(int n, int open, int close, StringBuilder sb){
        if(open == n && close == n){
            res.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append("(");
            find(n, open + 1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open){
            sb.append(")");
            find(n, open, close + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
}