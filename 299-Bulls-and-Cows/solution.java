public class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int bull = 0, cows = 0;
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) bull++;
            else {
                if(map.containsKey(secret.charAt(i))) {
                    int temp = map.get(secret.charAt(i));
                    map.put(secret.charAt(i), temp + 1);
                }
                else {
                    map.put(secret.charAt(i), 1);
                }
                
            }
        }
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) != guess.charAt(i)) {
                if(map.containsKey(guess.charAt(i))) {
                        cows++;
                        int temp = map.get(guess.charAt(i));
                        if(temp == 1) {
                            map.remove(guess.charAt(i));
                        }
                        else {
                            map.put(guess.charAt(i), temp - 1);
                        }
                }
            }
        }
        return bull + "A" + cows + "B";
    }
}