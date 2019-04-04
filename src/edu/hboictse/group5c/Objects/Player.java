package edu.hboictse.group5c.Objects;

import edu.hboictse.group5c.Game;
import edu.hboictse.group5c.GameField.Level;
import edu.hboictse.group5c.GameField.OptionPanel;
import edu.hboictse.group5c.Objects.Blocks.*;

import javax.swing.*;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 1.0
 */
public class Player extends GameObject {

    private Key key;
    private String direction;

    /**
     * Constructor of Player
     *
     * @param x Integer of the Player X position
     * @param y Integer of the Player Y position
     */
    public Player(int x, int y) {
        super(x, y);
        this.direction = "EAST";
        //  Sets the image of the Player
        this.setPlayerImage();
    }

    /**
     * Checks if Player will collide with a Tile, Barricade or Wall
     * Returns true if Player can move and returns false if move is not possible
     *
     * @param nextBlock Block that is possible the nextBlock
     * @return A boolean if Player move is valid
     */
    public boolean checkCollision(Block nextBlock) {
        if (nextBlock instanceof Tile) {
            if (nextBlock.hasGameObject() && nextBlock.getGameObject() instanceof Key) {
                //  Player picks up Key
                this.pickUpKey((Key) nextBlock.getGameObject());
                Game.setMessage("Picked up key");
            }
            return true;
        } else if (nextBlock instanceof Barricade) {
            int baricadeCode = ((Barricade) nextBlock).getCode();
            return checkBarricadeValue(baricadeCode);
        } else if (nextBlock instanceof Wall) {
            Game.setMessage("Wall !!!");
            return false;
        }
        return false;
    }

    /**
     * Checks is player is will step on EndTile
     * @param nextBlock Block this is possible the EndTile
     * @return A boolean if it is a EndTile
     */
    public boolean checkPlayerOnEndField(Block nextBlock){
        if (nextBlock instanceof EndTile) {
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
        //  Checks if Player has a Key
        if (!this.hasKey()) {
            Game.setMessage("NO KEY !!!");
            return false;
        } else {
            //  Checks if Key code is the same as Barricade code
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

    public void setDirection(String direction){
        this.direction = direction;
        this.setPlayerImage();
    }

    private void setPlayerImage(){
        switch (this.direction) {
            case "NORTH":
                super.setImage(new ImageIcon("Images/Player-B.png"));
                break;
            case "SOUTH":
                super.setImage(new ImageIcon("Images/Player-F.png"));
                break;
            case "EAST":
                super.setImage(new ImageIcon("Images/Player-R.png"));
                break;
            case "WEST":
                super.setImage(new ImageIcon("Images/Player-L.png"));
                break;
            default:
                System.out.println("Image is NULL -> ERROR !!!");
                break;
        }
    }
}
