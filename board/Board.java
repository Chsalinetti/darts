package board;
/**
 * Creates entire dartboard with a standard layout
 */

import java.util.HashMap;
import java.util.Map;

public class Board {
    private static final int[] POINTS_LIST = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 50};
    private Map<Integer, Section> board = new HashMap<Integer, Section>(); // map of sections on board using names as keys

    public Board() {
        for (int points : POINTS_LIST) {
            Section section = new Section(points);
            board.put(section.getPoints(), section);
        }
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (int key : board.keySet()) {
            str.append("[" + board.get(key).toString() + "]");
        }
        return str.toString();
    }
    public Map<Integer, Section> getBoard() {
        return board;
    }
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
    }
}
