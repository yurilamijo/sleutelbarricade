package edu.hboictse.group5c;

public class Main {

    public static void main(String[] args) {
        FieldFrame frame = new FieldFrame();
        Player player = new Player(0,0);

        frame.setVisible(true);
        frame.setFocusable(true);
        frame.addKeyListener(player);
    }
}
