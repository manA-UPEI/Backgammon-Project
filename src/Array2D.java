import java.util.ArrayList;

public class Array2D {
    ArrayList<ArrayList<String>> board;

    public Array2D(){
        this.board= new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 24; i++){
            board.add(new ArrayList<String>());
        }
        for (int i = 0; i < 24; i++){
            board.get(0).add("w");
        }
    }

}
