package edu.hboictse.group5c.Objects;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
import edu.hboictse.group5c.GameField.Levels;
import edu.hboictse.group5c.Objects.Blocks.*;
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
    private Block[][] field;

    private Key key;
    private BufferedImage image;

    public Player(int level) {
        super(0, 0);
        Levels levels = new Levels(level);
        this.field = levels.getLevel();

        try {
            this.image = ImageIO.read(new File("Images/Player.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        this.setImage(this.image.getScaledInstance(70, 70, Image.SCALE_FAST));
        this.image.getScaledInstance(70, 70, Image.SCALE_FAST);
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

        try {
            this.image = ImageIO.read(new File("Images/Player.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        this.setImage(this.image.getScaledInstance(70, 70, Image.SCALE_FAST));
        this.image.getScaledInstance(70, 70, Image.SCALE_FAST);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 0, 70, 70);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * Key listener for the Player
     * @param e KeyEvent too detect Player movement
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                this.y++;
                System.out.println("UP: " + "Y: " + this.y + " X: " + this.x);
                break;
            case KeyEvent.VK_DOWN:
                this.y--;
                System.out.println("DOWN: " + "Y: " + this.y + " X: " + this.x);
                break;
            case KeyEvent.VK_RIGHT:
                this.x++;
                System.out.println("RIGHT: " + "Y: " + this.y + " X: " + this.x);
                break;
            case KeyEvent.VK_LEFT:
                this.x--;
                System.out.println("LEFT: " + "Y: " + this.y + " X: " + this.x);
                break;
            default:
                System.out.println("Not a Key");
                break;
        }
    }

    private Boolean checkMove(int x, int y) {
        Block targetBlock = checkBlock(x,y);
        if(targetBlock.getClass() == Barricade.class) {
            return checkBarricade(targetBlock);
        }
        if(targetBlock.getClass() == Tile.class) {
            return true;
        }
        if(targetBlock.getClass() == EndTile.class) {
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
        if(this.key.getCode() >= barricade.getValue()) {
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

//    public Image getImage() {
//        return this.image.getScaledInstance(70, 70, Image.SCALE_FAST);
//    }
}
