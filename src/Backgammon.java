import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Backgammon {
    public static void main(String[] args) {
        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Dice.startFirstRoll(player1,player2);

    }
}
