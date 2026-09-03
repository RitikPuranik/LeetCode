class Solution {
    public boolean uniformArray(int[] nums1) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums1){
            min = Math.min(min, i);
            if(i % 2 != 0) count++;
        }
        return count == 0 || min % 2 != 0; 
    }
}