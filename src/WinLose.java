import java.util.Queue;

public class WinLose {

    public static void runQueue(Queue<Player> turnQueue){// Game simulation: Alternate turns


        while (!turnQueue.isEmpty()) {
            Dice dice = new Dice();
            Player currentPlayer = turnQueue.poll();  // Get the player whose turn it is
            System.out.println(currentPlayer.getName() + "'s turn.");
            // The player takes their turn here (game logic)
            int[] rolls = currentPlayer.roll2Dice();

            // After their turn, move them to the back of the queue
            turnQueue.add(currentPlayer);  // Move the player to the back of the queue
        }
    }

}
