public class Find_the_Highest_Altitude {
    class Solution {
        public int largestAltitude(int[] gain) {
            int max = Math.max(gain[0],0);
            for(int i = 1; i < gain.length; i++){
                gain[i] += gain[i-1];
                max = Math.max(gain[i], max);
            }
            return max;
        }
    }
}
