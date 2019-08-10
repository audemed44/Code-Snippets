import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

class DnDCharacter {

    int strength, constitution, dex, intelligence, wisdom, charisma;

    DnDCharacter()
    {
        this.strength = ability();
        this.constitution = ability();
        this.dex = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int[] rollDice() {
        Random rand = new Random();
        int[] dice = new int[4];
        for(int i = 0; i< dice.length; i++) {
            dice[i] = rand.nextInt(6)+1;

        }
        return dice;
    }

    int ability() {

        int[] dice = rollDice();
        int number = 0;
        Arrays.sort(dice);
        for(int i=1; i<dice.length; i++) number += dice[i];
        return number;
        
    }

    int modifier(int input) {
        double modifier = (input - 10.0)/2.0;
        modifier = Math.floor(modifier);

        return (int)modifier;
    }

    int getStrength() {
        
        return this.strength;

    }

    int getDexterity() {
       
        return this.dex;

    }

    int getConstitution() {
        
        return this.constitution;

    }

    int getIntelligence() {
        
        return this.intelligence;

    }

    int getWisdom() {
        
        return this.strength;

    }

    int getCharisma() {
       
        return this.charisma;

    }

    int getHitpoints() {
        
        int modifier = modifier(constitution);
        return 10 + modifier;

    }

}
