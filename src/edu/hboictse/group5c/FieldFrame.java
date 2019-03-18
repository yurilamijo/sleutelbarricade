package edu.hboictse.group5c;

/**
 * FieldFrame Class that extends JFrame
 *
 * @author Yuri Lamijo
 * @version 1.0
 */

import edu.hboictse.group5c.Assets.Player;
import edu.hboictse.group5c.GameField.FieldBuilder;
import edu.hboictse.group5c.GameField.Levels;
import edu.hboictse.group5c.Objects.Key;

import javax.swing.*;
import java.awt.*;

public class FieldFrame extends JFrame {

    private static final int FRAME_WIDTH = 1028;
    private static final int FRAME_HEIGHT = 900;

    private JPanel mainPanel;
    private JPanel optionsPanel;
    private JLabel playerImg;
    private JLabel keyImg;
    private FieldBuilder fieldBuilder;
    private Levels levels;

    private Player player = new Player(0,0);
    private Key key = new Key(100);

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
        this.levels = new Levels(1);
        this.fieldBuilder = new FieldBuilder(levels.getLevel());

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
        this.playerImg.setIcon(new ImageIcon(this.player.getImage()));
    }

    private void createKeyImg(){
        this.keyImg = new JLabel();
        this.keyImg.setIcon(new ImageIcon(this.key.getImage()));
    }
}
