public class Find_Pivot_Index {
    class Solution {
        public int pivotIndex(int[] nums) {
            int totalSum = 0, leftSum = 0;
            int n = nums.length;
            for(int ele : nums){
                totalSum += ele;
            }
            for(int i = 0; i < n; i++){
                int rightSum = totalSum - leftSum - nums[i];
                if(rightSum == leftSum){
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }
    }
}
