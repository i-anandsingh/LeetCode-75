class Solution {
    public String removeStars(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '*'){
                s.add(str.charAt(i));
            } else{
                if(!s.empty()){
                    s.pop();
                }
            }
        }
        StringBuilder resultString = new StringBuilder();
        while(!s.empty()){
            resultString.append(s.pop());
        }
        return resultString.reverse().toString();
    }
}