package edu.hboictse.group5c;

/**
 * FieldFrame Class that extends JFrame
 *
 * @author Yuri Lamijo
 * @version 1.0
 */

import edu.hboictse.group5c.Objects.Player;
import edu.hboictse.group5c.GameField.Field;
import edu.hboictse.group5c.GameField.FieldBuilder;
import edu.hboictse.group5c.GameField.Levels;
import edu.hboictse.group5c.Objects.Key;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FieldFrame extends JFrame implements KeyListener {

    private static final int FRAME_WIDTH = 1028;
    private static final int FRAME_HEIGHT = 900;
    private final int lvlNum = 1;


    private JPanel mainPanel;
    private JPanel optionsPanel;
    private Field field;
    private FieldBuilder fieldBuilder;
    private Levels levels = new Levels(lvlNum);

    public FieldFrame() {
        createComponents();
        setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setTitle("Sleutel barricade");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);
        addKeyListener(this);
    }

    private void createComponents() {
        createOptionsPanel();
        createMainPanel();
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());
        this.fieldBuilder = new FieldBuilder(levels.getLevel());
        this.field = new Field();

        this.mainPanel.add(this.field, BorderLayout.CENTER);
        this.mainPanel.add(this.optionsPanel, BorderLayout.EAST);

        add(this.mainPanel);
    }

    private void createOptionsPanel() {
        this.optionsPanel = new JPanel();
        this.optionsPanel.add(new JButton("Test"), BorderLayout.CENTER);
         this.optionsPanel.add(new JButton("Reset"), BorderLayout.CENTER);
    }




    @Override
    public void keyTyped(KeyEvent e) {

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
                field.movePlayer("NORTH");
                break;
            case KeyEvent.VK_DOWN:
                field.movePlayer("SOUTH" );
                break;
            case KeyEvent.VK_RIGHT:
                field.movePlayer("EAST");
                break;
            case KeyEvent.VK_LEFT:
                field.movePlayer("WEST");
                break;
            default:
                System.out.println("Not a Key");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
