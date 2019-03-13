package edu.hboictse.group5c;

/**
 * FieldFrame Class that extends JFrame
 *
 * @author Yuri Lamijo
 * @version 1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FieldFrame extends JFrame {

    private static final int FRAME_WIDTH = 1028;
    private static final int FRAME_HEIGHT = 900;

    private JPanel mainPanel;
    private JPanel gamePanel;
    private JPanel optionsPanel;
    private JButton button;
    private JLabel message;
    private JLabel playerImg;

    private Player player = new Player(0, 0);

    private Field field = new Field();

    public FieldFrame() {
        createComponents();
        setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setTitle("Sleutel barricade");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        addKeyListener(this.player);
    }

    private void createComponents() {
        createMessage();
        createButton();
//        createGamePanel();
        createPlayerImg();
        createOptionsPanel();
        createMainPanel();
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());

        this.mainPanel.add(this.field, BorderLayout.CENTER);
        this.mainPanel.add(this.playerImg, BorderLayout.NORTH);
        this.mainPanel.add(this.optionsPanel, BorderLayout.EAST);

        add(this.mainPanel);
    }

    private void createGamePanel() {
//        this.gamePanel = new JPanel(new GridLayout());

//        this.gamePanel.add(this.field);
//        for (int i = 0; i < 175; i += 35) {
//            this.gamePanel.add(new Block(i, 0));
//        }
//        this.gamePanel.add(this.playerImg);
//        this.gamePanel.add(this.field);
    }

    private void createOptionsPanel() {
        this.optionsPanel = new JPanel();
        this.optionsPanel.setBackground(Color.GRAY);

        this.optionsPanel.add(this.message);
        this.optionsPanel.add(this.button);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("REFRESH");
        }
    }

    private void createButton() {
        ButtonListener listener = new ButtonListener();
        this.button = new JButton("Refresh");
        this.button.addActionListener(listener);
    }

    private void createMessage() {
        this.message = new JLabel();
        this.message.setText("Welkom");
    }

    private void createPlayerImg() {
        this.playerImg = new JLabel();
        this.playerImg.setIcon(new ImageIcon(this.player.getImage()));
    }
}
