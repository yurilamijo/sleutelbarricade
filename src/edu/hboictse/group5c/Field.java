package edu.hboictse.group5c;

import edu.hboictse.group5c.Blocks.Block;
import edu.hboictse.group5c.Blocks.Tile;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Field extends JPanel {

    private static final int SIZE = 70;
    private static final int GRID_SIZE = 1000 / 90;

    private Tile[][] tiles = new Tile[GRID_SIZE][GRID_SIZE];

    public Field() {
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
        setBackground(Color.BLUE);

        createBlocks();
    }

    // WERKT NIET :( -> OOP
    private void createBlocks() {
        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[x].length; y++) {
                add(new Block(x, y));
            }
        }
    }

    // WERKT
    @Override
    protected void paintComponent(Graphics g) {
        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[x].length; y++) {
                g.setColor(Color.BLACK);
                g.fillRect(x * SIZE,y * SIZE,SIZE,SIZE);
                g.setColor(Color.ORANGE);
                g.drawRect(x * SIZE,y * SIZE,SIZE,SIZE);
            }
        }
    }
}
