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
 * @version 0.1
 */
public class Game extends JFrame implements KeyListener {

    private static JPanel mainPanel = new JPanel();
    private static OptionPanel optionPanel = new OptionPanel();
    private static Field field = new Field(optionPanel);

    public Game() {
        super.setSize(new Dimension(1028, 730));
        super.setTitle("Sleutel barricade");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        super.add(mainPanel);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.requestFocus();
        game.requestFocusInWindow();
        game.setFocusable(true);
        game.addKeyListener(game);
    }

    private static void createComponents() {
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(field, BorderLayout.WEST);
        mainPanel.add(optionPanel, BorderLayout.EAST);
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
}
