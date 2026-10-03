class Solution {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int res = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') left++;
            else right++;

            if(right > left) left = right = 0;
            else if(left == right) res = Math.max(res, left + right);

        }

        left = right = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch == ')') left++;
            else right++;

            if(right > left) left = right = 0;
            else if(left == right) res = Math.max(res, left + right);
        }

        return res;
    }
}