class CoinChange {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        System.out.println(getCoin(arr));
    }

    public static int getCoin(int[] arr) {

        int sum = 4;
        int[] dp = new int[sum + 1];

        dp[0] = 1;

        for (int coin : arr) {

            for (int i = coin; i <= sum; i++) {
                int a = dp[i];
                int b = dp[i-coin];
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];
    }
}
