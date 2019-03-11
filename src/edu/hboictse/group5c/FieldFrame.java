package edu.hboictse.group5c;

import javax.swing.*;
import java.awt.*;

public class FieldFrame extends JFrame {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

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

    private void createButton() {
        this.button = new JButton("Start");
    }
}
