package edu.hboictse.group5c.Objects;

import javax.swing.*;
import java.awt.*;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class GameObject extends JLabel {

    private int posX;
    private int posY;
    private int SIZE;
    private ImageIcon image;

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
        return this.posX;
    }

    /**
     * Returns the Y position of the Player
     *
     * @return Integer of the Y position
     */
    public int getPosY() {
        return this.posY;
    }

    public void setPosX(int x) {
        this.posX = x;
    }

    public void setPosY(int y) {
        this.posY = y;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public void setBlockSize(int SIZE) {
        this.SIZE = SIZE;
    }

    public ImageIcon getImage() {
        return this.image;
    }
}
