import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    Random random;

    public Dice() {
        Random random = new Random();
    }

    // Rolls a single die and returns the result (1-6)
    public int roll() {
        return random.nextInt(6) + 1;  // Rolls a number between 1 and 6
    }

    // Rolls two dice and returns the results as an array
    public int[] rollTwoDice() {
        int[] rolls = new int[2];
        rolls[0] = roll();  // First dice roll
        rolls[1] = roll();  // Second dice roll
        return rolls;
    }

    public static void startFirstRoll(Player player1, Player player2) {
        //Player player1 = new Player("1st Player");
        //Player player2 = new Player(name2);

        // Roll dice for both players
        player1.rollDice();
        player2.rollDice();

        // Print the dice rolls for information
        System.out.println(player1.getName() + " rolled: " + player1.getDiceRoll());
        System.out.println(player2.getName() + " rolled: " + player2.getDiceRoll());

        // Queue to manage alternating turns
        Queue<Player> turnQueue = new LinkedList<>();

        // Add the player with the highest roll to the front of the queue
        if (player1.getDiceRoll() > player2.getDiceRoll()) {
            turnQueue.add(player1);
            turnQueue.add(player2);
            System.out.println(player1.getName() + " goes first.");
        }else if (player2.getDiceRoll() > player1.getDiceRoll()) {
            turnQueue.add(player2);
            turnQueue.add(player1);
            System.out.println(player2.getName() + " goes first.");
        }

        while (player1.getDiceRoll() == player2.getDiceRoll()) {
            System.out.println("Tie! Re-rolling...");
                player1.rollDice();
                player2.rollDice();
            }


        WinLose.runQueue(turnQueue);
    }
    // Rolls any number of dice and returns the results as an array
    public int[] rollDice(int numDice) {
        int[] rolls = new int[numDice];
        for (int i = 0; i < numDice; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }
        return rolls;
    }

}
