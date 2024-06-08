public class Max_Consecutive_Ones_III_1004 {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0, right = 0;
            int n = nums.length;
            int zero_cnt = 0, ans = 0;
            while(right < n){
                if(nums[right] == 0){
                    zero_cnt++;
                }
                while(zero_cnt > k){
                    if(nums[left] == 0){
                        zero_cnt--;
                    }
                    left++;
                }
                ans = Math.max(ans, right-left+1);
                right++;
            }
            return ans;
        }
    }
}