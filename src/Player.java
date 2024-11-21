import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Player {
    private String name;
    private int diceRoll;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int rollDice() {
        //Random random = new Random();
        //diceRoll = random.nextInt(6) + 1; // Dice roll between 1 and 6
        //return diceRoll;
        Dice dice = new Dice();
        int roll = dice.roll();
        return roll;
    }

    public int[] roll2Dice() {
        //Random random = new Random();
        //diceRoll = random.nextInt(6) + 1; // Dice roll between 1 and 6
        //return diceRoll;
        Dice dice = new Dice();
        int[] roll = dice.rollTwoDice();
        return roll;
    }

    public int getDiceRoll() {
        return diceRoll;
    }


}

