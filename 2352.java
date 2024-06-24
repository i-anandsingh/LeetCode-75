class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for(int i = 0; i < grid.length; i++){
            List<Integer> rowElements = new ArrayList<>();
            for(int j = 0; j < grid[i].length; j++){
                rowElements.add(grid[i][j]);
            }
            map.put(rowElements, map.getOrDefault(rowElements, 0)+1);
        }
        for(int i = 0; i < grid[0].length; i++){
            List<Integer> colElements = new ArrayList<>();
            for(int j = 0; j < grid.length; j++){
                colElements.add(grid[j][i]);
            }
            ans += map.getOrDefault(colElements, 0);
        }
        return ans;
    }
}