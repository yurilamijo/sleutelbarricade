package edu.hboictse.group5c.Objects;

import javax.swing.*;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class GameObject extends JLabel {

    private int posX;
    private int posY;
    private ImageIcon image;

    /**
     * Constructor of GameObject
     *
     * @param x Integer of the X position
     * @param y Integer of the Y position
     */
    public GameObject(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    /**
     * Returns the X position of the Player
     *
     * @return Integer of the X position
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Sets the X position of Player
     *
     * @param posX Integer of the new X position
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Returns the Y position of the Player
     *
     * @return Integer of the Y position
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Sets the Y position of Player
     *
     * @param posY Integer of the new Y position
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Sets the image of GameObject
     *
     * @param image Image of the GameObject
     */
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    /**
     * Gets the image of the GameObject
     *
     * @return ImageIcon with the image of the GameObject
     */
    public ImageIcon getImage() {
        return this.image;
    }
}
