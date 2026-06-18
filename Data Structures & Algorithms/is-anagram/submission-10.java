

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        } 

        HashMap<Character, Integer> letters = new HashMap<>();
        

        for( int i = 0; i < s.length(); i++){
            if(!letters.containsKey(s.charAt(i))){
                letters.put(s.charAt(i), 1);
            } else {
                int temp = letters.get(s.charAt(i))+1;
                letters.replace(s.charAt(i), temp);
            }

            if(!letters.containsKey(t.charAt(i))){
                letters.put(t.charAt(i),-1);
            } else {
                int temp = letters.get(t.charAt(i))-1;
                letters.replace(t.charAt(i), temp);
            }
        }

        for( char val : letters.keySet()){
            if(letters.get(val) != 0){
                return false;
            }
        }
        return true;
    }
}
