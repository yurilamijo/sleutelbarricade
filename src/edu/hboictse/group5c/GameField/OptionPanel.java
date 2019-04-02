package edu.hboictse.group5c.GameField;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPanel extends JPanel implements ActionListener {

    private JPanel option;
    private JPanel mainPanel;

    private JLabel message = new JLabel();

    public OptionPanel() {
        createOption();
        createMainPanel();
        this.setPreferredSize(new Dimension(200,900));
    }

    public void setMessage(String txt) {
        this.message.setHorizontalAlignment(SwingConstants.CENTER);
        this.message.setText(txt);
        super.update(this.getGraphics());
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.add(this.message, BorderLayout.CENTER);
        this.mainPanel.add(this.option, BorderLayout.NORTH);

        add(this.mainPanel);
    }

    private void createOption() {
        this.option = new JPanel(new BorderLayout());
//        option.setLayout(new GridLayout(2,2,20,50));
        JButton reset = new JButton("Reset");
        JButton nextLevel = new JButton("Next Level");

        reset.addActionListener(this);
        nextLevel.addActionListener(this);

        this.option.add(reset, BorderLayout.WEST);
        this.option.add(nextLevel, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked: " );
    }
}

