package edu.hboictse.group5c;

/**
 * Main Class of the game
 * FieldFrame - creates a JFrame of the game
 * Player - creates Player so it can move
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
        FieldFrame frame = new FieldFrame();

        frame.setVisible(true);
        frame.setFocusable(true);
    }
}
