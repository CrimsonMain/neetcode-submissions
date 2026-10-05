class Solution {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;

        int[] arrStair = new int[n + 1];
        arrStair[0] = 0;
        arrStair[1] = 1;
        arrStair[2] = 2;
        arrStair[3] = 3;

        for(int i = 4; i <= n; i++){
            arrStair[i] = arrStair[i - 1] + arrStair[i - 2];
        }

        return arrStair[n];
    }
}
