package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.GameObject;

import javax.swing.*;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Block extends JLabel {

    private int posX;
    private int posY;
    private ImageIcon image;

    private GameObject gameObject;

    /**
     * Constructor of Block with X and Y positions
     * @param x Position of Block
     * @param y Position of Block
     */
    public Block(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    /**
     * Returns the X position of the Block
     *
     * @return Integer of the X position
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Sets the X position of Block
     *
     * @param posX Integer of the new X position
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Returns the Y position of the Block
     *
     * @return Integer of the Y position
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Sets the Y position of Block
     *
     * @param posY Integer of the new Y position
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Checks if Block has a GameObject and then returns a boolean
     * @return A boolean if Block has a GameObject
     */
    public boolean hasGameObject() {
        return this.gameObject != null;
    }

    /**
     * Returns a GameObject if Block has one
     * @return GameObject of the Block
     */
    public GameObject getGameObject() {
        return gameObject;
    }

    /**
     * Sets a GameObject of Block
     * @param gameObject GameObject of Block
     */
    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    /**
     * Sets the image of Block
     *
     * @param image Image of the Block
     */
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    /**
     * Gets the image of the Block
     *
     * @return ImageIcon with the image of the Block
     */
    public ImageIcon getImage() {
        return this.image;
    }
}
