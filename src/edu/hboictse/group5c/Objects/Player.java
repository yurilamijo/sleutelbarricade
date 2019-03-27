package edu.hboictse.group5c.Objects;

import edu.hboictse.group5c.GameField.Levels;
import edu.hboictse.group5c.Objects.Blocks.*;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Player extends GameObject {

    private Block[][] field;
    private Key key;

    public Player(int level) {
        super(0, 0);
        Levels levels = new Levels(level);
        this.field = levels.getLevel();

        super.setImage(new ImageIcon("Images/Player.png"));
    }

    /**
     * Constructor of Player
     *
     * @param x Integer of the Player X position
     * @param y Integer of the Player Y position
     */
    public Player(int x, int y, int level) {
        super(x, y);
        Levels levels = new Levels(level);
        this.field = levels.getLevel();

        super.setImage(new ImageIcon("Images/Player.png"));
    }

    public boolean checkMove(Block nextBlock) {
        if (nextBlock instanceof Barricade) {
            System.out.println("Barricade");
            int baricadeCode = ((Barricade) nextBlock).getCode();
            return checkBarricadeValue(baricadeCode);
        } else if (nextBlock instanceof Wall) {
            System.out.println("Wall");
            return false;
        } else if (nextBlock instanceof Tile) {
            if (nextBlock.hasGameObject() && nextBlock.getGameObject() instanceof Key) {
                System.out.println("Key");
                this.pickUpKey((Key) nextBlock.getGameObject());
            }
            return true;
        }
        return false;
    }

    public boolean checkBarricadeValue(int barricadeCode) {
        if (this.key == null) {
            System.out.println("NO KEY");
            return false;
        } else {
            if (barricadeCode == this.key.getCode()) {
                System.out.println("KEY !!!");
                return true;
            } else {
                System.out.println("WRONG KEY !!!");
                return false;
            }
        }
    }

    public void pickUpKey(Key key) {
        this.key = key;
    }
}
