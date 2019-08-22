import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public boolean isPangram(String input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alphabet.length(); i++)
        {
            map.put(alphabet.charAt(i),0);
        }
        input = input.toLowerCase();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(input.contains(Character.toString(entry.getKey())))
            {
                entry.setValue(entry.getValue()+1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()<=0)
                return false;
        }
        return true;
    }

}
