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

public class FieldFrame extends JFrame {

    private static final int FRAME_WIDTH = 1028;
    private static final int FRAME_HEIGHT = 900;
    private final int lvlNum = 1;

    private JPanel mainPanel;
    private JPanel optionsPanel;
    private JLabel playerImg;
    private JLabel keyImg;
    private FieldBuilder fieldBuilder;
    private Levels levels = new Levels(lvlNum);

    private Player player = new Player(0, 0, lvlNum);
    private Key key = new Key(100);

    public FieldFrame() {
        createComponents();
        setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setTitle("Sleutel barricade");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        addKeyListener(this.player);
    }

    private void createComponents() {
        createPlayerImg();
        createOptionsPanel();
        createMainPanel();
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());
        this.fieldBuilder = new FieldBuilder(levels.getLevel());

        this.mainPanel.add(this.playerImg, BorderLayout.NORTH);
        this.mainPanel.add(this.fieldBuilder, BorderLayout.CENTER);
        this.mainPanel.add(this.optionsPanel, BorderLayout.EAST);

        add(this.mainPanel);
    }

    private void createOptionsPanel() {
        this.optionsPanel = new JPanel();
        this.optionsPanel.add(new JButton("Test"), BorderLayout.CENTER);
    }

    private void createPlayerImg() {
        this.playerImg = new JLabel();
        this.playerImg.setIcon(this.player.getImage());
    }

    private void createKeyImg() {
        this.keyImg = new JLabel();
        this.keyImg.setIcon(this.key.getImage());
    }
}
