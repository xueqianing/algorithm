package dynamic_programming;

public class HouseRobber {
    public int rob(int[] nums){
        int n = nums.length;
        if(nums == nums || n ==0){
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 0; i < n; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i=1]);
        }

        return dp[n];

    }
}
