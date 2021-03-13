package board;
/**
 * Creates entire dartboard with a standard layout
 */

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<String, Section> board = new HashMap<String, Section>(); // map of sections on board using names as keys

    public Board() {
        int[] pointsList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 50};
        for (int points : pointsList) {
            Section section = new Section(points);
            String key = section.getName();
            board.put(key, section);
        }
    }
    @Override
    public String toString() {
        return board.toString();
    }
    public Map<String, Section> getBoard() {
        return board;
    }
}
