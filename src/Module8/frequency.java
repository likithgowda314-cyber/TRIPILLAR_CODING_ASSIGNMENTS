package Module8;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        String str = "Naveen";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(map.toString());
    }
}