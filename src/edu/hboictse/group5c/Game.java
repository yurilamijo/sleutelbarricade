package edu.hboictse.group5c;

import edu.hboictse.group5c.GameField.Field;
import edu.hboictse.group5c.GameField.OptionPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Game Class of the game
 *
 * @author Yuri Lamijo
 * @version 1.0
 */
public class Game extends JFrame implements KeyListener {

    private static JPanel mainPanel = new JPanel();
    private static OptionPanel optionPanel = new OptionPanel();
    private static Field field = new Field();
    private static Game game = new Game();

    public Game() {
        super.setMinimumSize(new Dimension(1028, 900));
        super.setTitle("Sleutel barricade");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        super.setResizable(false);
        createComponents();
        super.pack();
        super.add(mainPanel);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        setListener();
    }

    private static void createComponents() {
        JPanel center = new JPanel();
        center.add(field);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(optionPanel, BorderLayout.NORTH);
        mainPanel.add(center, BorderLayout.CENTER);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W) {
            field.movePlayer("NORTH");

        }
        if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S) {
            field.movePlayer("SOUTH");
        }
        if (keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D) {
            field.movePlayer("EAST");
        }
        if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A) {
            field.movePlayer("WEST");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * Removes and adds KeyListener
     */
    public static void setListener(){
        game.removeKeyListener(game);
        game.requestFocus();
        game.requestFocusInWindow();
        game.setFocusable(true);
        game.addKeyListener(game);
    }

    /**
     * Sets the message for the Player
     * @param msg String with the message
     */
    public static void setMessage(String msg){
        optionPanel.setMessage(msg);
    }

    /**
     * Sets the next level if button is pressed
     */
    public static void nextLevel(){
        field.updateField("NEXT_LEVEL");
        setListener();
    }

    /**
     * Resets the next level if button is pressed
     */
    public static void reset(){
        field.updateField("RESET");
        setListener();
    }
}
