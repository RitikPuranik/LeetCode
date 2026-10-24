class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aA = day2date(arriveAlice);
        int lA = day2date(leaveAlice);
        int aB = day2date(arriveBob);
        int lB = day2date(leaveBob);

        int startoverlap = Math.max(aA, aB);
        int endoverlap = Math.min(lB, lA);

        return Math.max(0 ,endoverlap - startoverlap + 1);
    }
    int day2date(String s){
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;

        int m = Integer.parseInt(s.substring(0, 2));
        int d = Integer.parseInt(s.substring(3, 5));

        for(int i = 0; i < m - 1; i++) ans += months[i];

        return ans + d;
    }
}