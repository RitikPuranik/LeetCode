class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num * 9) return "";

        int x = sum / 9;
        int y  = sum % 9;

        StringBuilder ans  = new StringBuilder().repeat('9', x);
        if(y > 0) ans.append(y);
        ans.repeat('0', num - ans.length());

        return ans.toString();
    }    
}