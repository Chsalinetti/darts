package board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Section {
    private static final List<Integer> IS_BLACK = Arrays.asList(2, 3, 7, 8, 10, 12, 13, 14, 18, 20);
    //points
    private int points;
    //location
    private int number;
    private String name;
    //color
    private String color; //black or white
    //status
    
    public Section(int points) {
        this.points = points;
        if (points <= 20) {
            this.number = points;
            this.name = "" + points;
            if (IS_BLACK.contains(points))  {
                this.color = "Black";
            }
            else {
                this.color = "White";
            }
        }
        else if (points == 25) {
            this.number = 21;
            this.name = "Outer Bullseye";
            this.color = null;
        }
        else if (points == 50) {
            this.number = 22;
            this.name = "Bullseye";
            this.color = null;
        }
    }

}