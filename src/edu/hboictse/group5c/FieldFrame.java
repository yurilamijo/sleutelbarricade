package edu.hboictse.group5c;

/**
 * FieldFrame Class that extends JFrame
 *
 * @author Yuri Lamijo
 * @version 1.0
 */

import edu.hboictse.group5c.GameField.Field;
import edu.hboictse.group5c.Assets.Player;

import javax.swing.*;
import java.awt.*;

public class FieldFrame extends JFrame {

    private static final int FRAME_WIDTH = 1028;
    private static final int FRAME_HEIGHT = 900;

    private JPanel mainPanel;
    private JPanel optionsPanel;
    private JLabel playerImg;

    private Field field;

    private Player player = new Player(0, 0);

    public FieldFrame() {
        createComponents();
        setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setTitle("Sleutel barricade");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        addKeyListener(this.player);
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
    }

    private void createPlayerImg() {
        this.playerImg = new JLabel();
        this.playerImg.setIcon(new ImageIcon(this.player.getImage()));
    }
}
