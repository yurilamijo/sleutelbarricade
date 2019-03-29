package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.FieldFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class OptionPanel extends JFrame implements ActionListener{



    private static final int FRAME_WIDTH = 350;
    private static final int FRAME_HEIGHT = 350;
    private JPanel option;
    private JPanel mainPanel;


    public OptionPanel(){
        createOption();
        createMainPanel();
     setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
     setTitle("Options");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
    setFocusable(true);
    addActionListener(this);
    }

    private void createMainPanel() {
        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.add(this.option, BorderLayout.CENTER);

        add(this.mainPanel);
    }


    private void createOption(){
        this.option = new JPanel();
        this.option.add(new JButton("Restart"), BorderLayout.CENTER);
        this.option.add(new JButton("Exit"), BorderLayout.CENTER);
        this.option.add(new JButton("Play"), BorderLayout.CENTER);
    }







    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(option,"Woow");
    }
}

