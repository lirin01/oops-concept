package Trial;
public class LongestIncreasingSubString {
    public static int lic(int[] nums){
        if(nums.length ==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int ans=1;
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    max= Math.max(max,dp[j]);
                }
                dp[i] = max+1;
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] result = {0,4,12,2,10,6,9,13,3,11,7,15};
        System.out.println(lic(result));
    }
}

