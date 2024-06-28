class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            boolean flag = false;
            while(!s.empty() && asteroids[i] < 0 && s.peek() > 0){
                if(Math.abs(asteroids[i]) > s.peek()){
                    s.pop();
                } else if(Math.abs(asteroids[i]) == s.peek()){
                    s.pop();
                    flag = true;
                    break;
                } else{
                    flag = true;
                    break;
                } 
            }
            if(!flag){
                s.add(asteroids[i]);
            }
        }
        int[] result = new int[s.size()];
        for(int i = s.size()-1; i >= 0; i--){
            result[i] = s.pop();
        }
        return result;
    }
}