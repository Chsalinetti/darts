package board;

import java.util.Arrays;
import java.util.List;
/**
 * Creates individual section on dartboard
 */
public class Section {
    private static final List<Integer> IS_BLACK = Arrays.asList(2, 3, 7, 8, 10, 12, 13, 14, 18, 20);
    //points
    private int points; //point value of section
    //location
    private int number; // order on the dartboard
    private String name; // name of the location
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
    @Override
    public String toString() {
        return name;
    }
    /**
     * returns the points recieved from hitting the section
     * @param multiplier 1, 2, or 3 depending on location hit
     * @return points recieved
     */
    public int hitSectiontPoints(int multiplier) {
        return points * multiplier;
    }
    public int getPoints() {
        return points;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

}