import java.util.HashMap;
import java.util.Map;

public class Second {
    public static void main(String[] args){
        boolean checkChar = false;
        String word = "Hello";
        Map<Character,Integer> charFrequency = new HashMap<>();

        for(char c: word.toCharArray()){
            charFrequency.put(c, charFrequency.getOrDefault(c,0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : charFrequency.entrySet()){
            if(entry.getValue() > 1){
                checkChar = true;
                System.out.println("Dublicate character: " + entry.getKey());
            }
        }

        if(!checkChar){
            System.out.println("Dublicate character not found");
        }

    }
}
