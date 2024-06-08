public class Longest_Subarray_of_1_After_Deleting_One_Element {
    class Solution {
        public int longestSubarray(int[] nums) {
            int left = 0, right = 0;
            int n = nums.length;
            int zero_cnt = 0, ans = 0;
            while(right < n){
                if(nums[right] == 0){
                    zero_cnt++;
                }
                while(zero_cnt > 1){
                    if(nums[left] == 0){
                        zero_cnt--;
                    }
                    left++;
                }
                ans = Math.max(ans, right-left);
                right++;
            }
            return ans;
        }
    }
}
