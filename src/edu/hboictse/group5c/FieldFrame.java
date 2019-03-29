package edu.hboictse.group5c;

import edu.hboictse.group5c.GameField.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * FieldFrame Class that extends JFrame
 *
 * @author Yuri Lamijo
 * @version 1.0
 */
public class FieldFrame extends JFrame implements KeyListener {

    private static final int FRAME_WIDTH = 1028;
    private static final int FRAME_HEIGHT = 900;

    private JPanel mainPanel;
    private JPanel optionsPanel;
    private Field field;

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
