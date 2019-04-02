package edu.hboictse.group5c.GameField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPanel extends JPanel implements ActionListener {

    private JPanel option;
    private JPanel mainPanel;

    private JLabel outPrint;

    public OptionPanel() {
        createOption();
        createMainPanel();
    }

    public void setLabelText(String txt) {
        outPrint.setText(txt);
        super.update(this.getGraphics());
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.add(this.option, BorderLayout.CENTER);

        add(this.mainPanel);
    }

    private void createOption() {
        this.option = new JPanel();
        option.setLayout(new GridLayout(2,2,20,50));
        JButton reset = new JButton("Reset");
        JButton nextLevel = new JButton("Next Level");
        outPrint = new JLabel("test");

        reset.addActionListener(this);
        nextLevel.addActionListener(this);

        this.option.add(reset);
        this.option.add(nextLevel);
        this.option.add(outPrint);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked: " );
    }
}

