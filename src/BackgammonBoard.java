import java.util.ArrayList;
import java.util.List;


public class BackgammonBoard {
    // 2D ArrayList to represent the Backgammon board
    private List<List<String>> board;

    // Constructor to initialize the board
    public BackgammonBoard() {
        // Create a 2D ArrayList with 24 points
        board = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            board.add(new ArrayList<>()); // Each point starts empty
        }
        this.setupInitialBoard();
    }

    // Add multiple checkers to a specific point
    public void addCheckers(int point, String player, int count) {
        if (point >= 0 && point < 24) {
            for (int i = 0; i < count; i++) {
                board.get(point).add(player); // Add the player's checker to the specified point
            }
        } else {
            System.out.println("Invalid point index: " + point);
        }
    }

    // Set up the initial configuration of the board
    public void setupInitialBoard() {
        // White checkers
        addCheckers(0, "W", 2);    // 2 White checkers at Point 0
        addCheckers(11, "W", 5);   // 5 White checkers at Point 11
        addCheckers(16, "W", 3);   // 3 White checkers at Point 16
        addCheckers(18, "W", 5);   // 5 White checkers at Point 18

        // Black checkers
        addCheckers(23, "B", 2);   // 2 Black checkers at Point 23
        addCheckers(12, "B", 5);   // 5 Black checkers at Point 12
        addCheckers(7, "B", 3);    // 3 Black checkers at Point 7
        addCheckers(5, "B", 5);    // 5 Black checkers at Point 5
    }

    // Display the board state
    public void displayBoard() {
        for (int i = 0; i < 24; i++) {
            System.out.println("Point " + i + ": " + board.get(i));
        }
    }

    //public void displayHDBoard(){

      //  for (int i = 11; i<24; i++){
        //    System.out.print("Point "+i+"   ");
        //}
        //System.out.println();
        //for (int i = 11; i<24; i++){
            //String string = pointToString(board.get(i));
            //if (string.length()<= 9) {
              //  System.out.print(string.substring(0,10));

                //int gap = 11 - string.length();

                //if (board.get(i).size() == 5){
                //  System.out.print(" ");
                //}
                //for (int j = 0; j < gap; j++) {
                //    System.out.print(" ");
               // }
            //}


        //}

    //}
    public String pointToString(List<String> point){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i<point.size();i++){
            string.append(point.get(i)) ;
            if (i<point.size()-1) {
                string.append("-");
            }
        }

        return string.toString();




    }

    // Main method for testing the board setup
    public static void main(String[] args) {
        BackgammonBoard backgammonBoard = new BackgammonBoard();
        backgammonBoard.setupInitialBoard();  // Set up the initial configuration
        backgammonBoard.displayBoard();       // Display the board state
    }
}
