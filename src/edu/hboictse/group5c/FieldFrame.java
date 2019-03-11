package edu.hboictse.group5c;

/**
 * FieldFrame Class that extends JFrame
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

    private JPanel panel;
    private JButton button;

    public FieldFrame() {
        createComponents();
        setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setTitle("Sleutel barricade");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createComponents() {
        createButton();
        createPanel();
    }

    private void createPanel() {
        this.panel = new JPanel();

        this.panel.add(this.button);

        add(this.panel);
    }

    class ButtonListener implements ActionListener {
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
}
