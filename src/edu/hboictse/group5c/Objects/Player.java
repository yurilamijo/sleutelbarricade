package edu.hboictse.group5c.Objects;

import edu.hboictse.group5c.Game;
import edu.hboictse.group5c.GameField.OptionPanel;
import edu.hboictse.group5c.Objects.Blocks.*;

import javax.swing.*;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Player extends GameObject {

    private Key key;

    /**
     * Constructor of Player
     *
     * @param x Integer of the Player X position
     * @param y Integer of the Player Y position
     */
    public Player(int x, int y) {
        super(x, y);
        super.setImage(new ImageIcon("Images/Player.png"));
    }

    /**
     * Checks if Player will collide with a Tile, Barricade or Wall
     *
     * @param nextBlock Block that is possible the nextBlock
     * @return A boolean if Player move is valid
     */
    public boolean checkCollision(Block nextBlock) {
        if (nextBlock instanceof Tile) {
            if (nextBlock.hasGameObject() && nextBlock.getGameObject() instanceof Key) {
                Game.setMessage("Picked up key");
                this.pickUpKey((Key) nextBlock.getGameObject());
            }
            return true;
        } else if (nextBlock instanceof Barricade) {
            int baricadeCode = ((Barricade) nextBlock).getCode();
            return checkBarricadeValue(baricadeCode);
        } else if (nextBlock instanceof Wall) {
            Game.setMessage("Wall !!!");
            return false;
        } else if (nextBlock instanceof EndTile) {
            JOptionPane.showMessageDialog(null, "END");
            return true;
        }
        return false;
    }

    /**
     * Checks if the Key code and the Barricade code is the same
     *
     * @param barricadeCode Integer of the barricade code
     * @return A boolean if Code of Key and Barricade is the same
     */
    public boolean checkBarricadeValue(int barricadeCode) {
        if (this.key == null) {
            Game.setMessage("NO KEY !!!");
            return false;
        } else {
            if (barricadeCode == this.key.getCode()) {
                Game.setMessage("Open barricade");
                return true;
            } else {
                Game.setMessage("WRONG KEY !!!");
                return false;
            }
        }
    }

    /**
     * Adds a Key to the Player pocket
     *
     * @param key Key that the player picked up
     */
    public void pickUpKey(Key key) {
        this.key = key;
    }

    /**
     * Checks if Player has a Key
     *
     * @return A boolean that says if PLayer has a Key
     */
    public boolean hasKey() {
        return this.key != null;
    }
}
