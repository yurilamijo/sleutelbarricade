package edu.hboictse.group5c.GameField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPanel extends JPanel implements ActionListener {

    private JPanel option;
    private JPanel mainPanel;

    public OptionPanel() {
        createOption();
        createMainPanel();
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.add(this.option, BorderLayout.CENTER);

        add(this.mainPanel);
    }

    private void createOption() {
        this.option = new JPanel();
        JButton reset = new JButton("Reset");
        JButton nextLevel = new JButton("Next Level");

        reset.addActionListener(this);
        nextLevel.addActionListener(this);

        this.option.add(reset);
        this.option.add(nextLevel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked: " );
    }
}

