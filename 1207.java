class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> storeOccurences = new HashMap<>();
        for(int ele : arr){
            storeOccurences.put(ele, storeOccurences.getOrDefault(ele, 0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(Map.Entry<Integer, Integer> mp : storeOccurences.entrySet()){
            if(s.contains(mp.getValue())){
                return false;
            }
            s.add(mp.getValue());
        }
        return true;
    }
}