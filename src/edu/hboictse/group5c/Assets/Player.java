package edu.hboictse.group5c.Assets;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
import edu.hboictse.group5c.GameObject;
import edu.hboictse.group5c.Objects.Key;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends GameObject implements KeyListener {

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
        super(x, y);

        try {
            this.image = ImageIO.read(new File("Images/Player.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        this.setImage(this.image.getScaledInstance(70, 70, Image.SCALE_FAST));
//        this.image.getScaledInstance(70, 70, Image.SCALE_FAST);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 0, 70, 70);
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

    private Boolean checkMove(int x, int y) {
        Block targetBlock = checkBlock(x,y);
        //if blockType = wall return false
        //if blocktype = barricade return checkBarricade()
        //if blocktype = tile return true
        //if blocktype = tile with key discard inv, add key to inv and return true

        return true;
    }

    private Block checkBlock(int x, int y) {
        //getField()
        //getBlock(x,y)
        //return Block
        return new Block(0,0,70);
    }

    private Boolean checkBarricade(Barricade barricade) {
        if(checkValue(barricade) == true) {
            //remove barricade from double array
            return true;
        } else {
            return false;
        }
    }

    private Boolean checkValue(Barricade barricade) {
        if(this.key.getCode() >= barricade.getValue()) {
            this.key.setCode(this.key.getCode() - barricade.getValue());
            return true;
        } else {
            return false;
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

//    public Image getImage() {
//        return this.image.getScaledInstance(70, 70, Image.SCALE_FAST);
//    }
}
