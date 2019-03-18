package edu.hboictse.group5c;

import javax.swing.*;
import java.awt.*;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class GameObject extends JComponent {

    private int posX;
    private int posY;
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

    public void setImage(Image image){
        this.image = new ImageIcon(image);
    }

    public ImageIcon getImage(){
        return this.image;
    }
}
