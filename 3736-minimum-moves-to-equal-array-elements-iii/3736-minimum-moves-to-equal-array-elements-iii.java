class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE, n = nums.length;
        int sum = 0;
        for(int num : nums){
            if(num > max) max = num;
            sum += num;
        }
        return n * max - sum;
    }
}