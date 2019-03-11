package edu.hboictse.group5c;

/**
 * Player Class
 * @author Yuri Lamijo
 * @version 1.0
 */

// TODO: 2019-03-11  pickUpKey Method
// TODO: 2019-03-11  removeKey Method

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {

    private int x;
    private int y;

    /**
     * Constructor of Player
     * @param x Integer of the Player X position
     * @param y Integer of the Player Y position
     */
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

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

    public void pickUpKey(){

    }

    public void removeKey(){

    }

    /**
     * Returns the X position of the Player
     * @return Integer of the X position
     */
    public int getPositionX() {
        return x;
    }

    /**
     * Returns the Y position of the Player
     * @return Integer of the Y position
     */
    public int getPositionY() {
        return y;
    }
}
