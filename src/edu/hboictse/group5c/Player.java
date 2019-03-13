package edu.hboictse.group5c;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */

import edu.hboictse.group5c.Objects.Key;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends JPanel implements KeyListener {

    private int x;
    private int y;

    private Key key;
    private BufferedImage image;

    /**
     * Constructor of Player
     *
     * @param x Integer of the Player X position
     * @param y Integer of the Player Y position
     */
    public Player(int x, int y) {
        this.x = x;
        this.y = y;

        try {
            this.image = ImageIO.read(new File("Images/Player.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        System.out.println(image);
//        g.drawImage(image, 0, 0, 70,70,this);
//    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * Key listener for the Player
     *
     * @param e KeyEvent too detect Player movement
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                this.moveUp();
                System.out.println("UP: " + "Y: " + this.y + " X: " + this.x);
                break;
            case KeyEvent.VK_DOWN:
                this.moveDown();
                System.out.println("DOWN: " + "Y: " + this.y + " X: " + this.x);
                break;
            case KeyEvent.VK_RIGHT:
                this.moveRight();
                System.out.println("RIGHT: " + "Y: " + this.y + " X: " + this.x);
                break;
            case KeyEvent.VK_LEFT:
                this.moveLeft();
                System.out.println("LEFT: " + "Y: " + this.y + " X: " + this.x);
                break;
            default:
                System.out.println("Not a Key");
                break;
        }
    }

    /**
     * Moves the Player UP by adding 1 to Y position
     */
    public void moveUp() {
        this.y++;
    }

    /**
     * Moves the Player DOWN by removing 1 to Y position
     */
    public void moveDown() {
        this.y--;
    }

    /**
     * Moves the Player RIGHT by adding 1 to X position
     */
    public void moveRight() {
        this.x++;
    }

    /**
     * Moves the Player LEFT by removing 1 to X position
     */
    public void moveLeft() {
        this.x--;
    }

    public void pickUpKey(Key key) {
        this.key = key;
    }

    public void removeKey() {
        // TODO: 2019-03-11  removeKey Method
    }

    /**
     * Returns the X position of the Player
     *
     * @return Integer of the X position
     */
    public int getPositionX() {
        return x;
    }

    /**
     * Returns the Y position of the Player
     *
     * @return Integer of the Y position
     */
    public int getPositionY() {
        return y;
    }

    public Image getImage() {
        return this.image.getScaledInstance(70, 70, Image.SCALE_FAST);
    }
}
