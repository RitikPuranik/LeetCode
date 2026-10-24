class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int ans = 0;

        String[] a = arriveAlice.split("-");
        String[] b = leaveAlice.split("-");
        String[] c = arriveBob.split("-");
        String[] d = leaveBob.split("-");

        int alice_came = Integer.parseInt(a[1]) + month[Integer.parseInt(a[0]) - 1];
        int alice_gone = Integer.parseInt(b[1]) + month[Integer.parseInt(b[0]) - 1];
        int bob_came = Integer.parseInt(c[1]) + month[Integer.parseInt(c[0]) - 1];
        int bob_gone = Integer.parseInt(d[1]) + month[Integer.parseInt(d[0]) - 1];

        int x = Math.max(alice_came, bob_came);
        int y = Math.min(alice_gone, bob_gone);

        if(x <= y) ans += y - x + 1;

        return ans;
    }
}