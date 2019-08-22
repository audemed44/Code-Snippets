import java.util.HashMap;

class Scrabble {

    HashMap<Character, Integer> map;
    String word;
    Scrabble(String word) {
        if(map == null ) map = new HashMap<Character, Integer>();
        map.put('A',1);
        map.put('B',3);
        map.put('C',3);
        map.put('D',2);
        map.put('E',1);
        map.put('F',4);
        map.put('G',2);
        map.put('H',4);
        map.put('I',1);
        map.put('J',8);
        map.put('K',5);
        map.put('L',1);
        map.put('M',3);
        map.put('N',1);
        map.put('O',1);
        map.put('P',3);
        map.put('Q',10);
        map.put('R',1);
        map.put('S',1);
        map.put('T',1);
        map.put('U',1);
        map.put('V',4);
        map.put('W',4);
        map.put('X',8);
        map.put('Y',4);
        map.put('Z',10);
        this.word = word.toUpperCase();

        
    }

    int getScore() {
        int score = 0;
        if (word == "") return 0;
        for(int i = 0; i < word.length(); i++)
        {
            score += map.get(word.charAt(i));
        }
        return score;    
    }

}
