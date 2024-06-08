public class Find_the_Difference_of_Two_Arrays {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for(int ele : nums1){
                set1.add(ele);
            }
            for(int ele : nums2){
                set2.add(ele);
            }
            List<Integer> diff1 = new ArrayList<>();
            List<Integer> diff2 = new ArrayList<>();
            for(int ele : set1){
                if(!set2.contains(ele)){
                    diff1.add(ele);
                }
            }
            for(int ele : set2){
                if(!set1.contains(ele)){
                    diff2.add(ele);
                }
            }
            List<List<Integer>> answer = new ArrayList<>();
            answer.add(diff1);
            answer.add(diff2);
            return answer;
        }
    }
}
