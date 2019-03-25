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

    private Boolean checkMove(int x, int y) {
        Block targetBlock = checkBlock(x, y);
        if (targetBlock.getClass() == Barricade.class) {
            return checkBarricade(targetBlock);
        }
        if (targetBlock.getClass() == Tile.class) {
            return true;
        }
        if (targetBlock.getClass() == EndTile.class) {
            return true;
        }
        return false;
    }

    private Block checkBlock(int x, int y) {
        return field[y][x];
    }

    private Boolean checkBarricade(Block targetBlock) {
        //if getValue <= ket.getCode return true else return false
        return true;
    }

    private Boolean checkValue(Barricade barricade) {
        if (this.key.getCode() >= barricade.getValue()) {
            this.key.setCode(this.key.getCode() - barricade.getValue());
            return true;
        } else {
            return false;
        }
    }

    public void pickUpKey(Key key) {
        this.key = key;
    }

    public void removeKey() {
        // TODO: 2019-03-11  removeKey Method
    }
}
