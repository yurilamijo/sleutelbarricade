package edu.hboictse.group5c;


import edu.hboictse.group5c.GameField.OptionPanel;
import javax.swing.*;

/**
 * Main Class of the game
 * FieldFrame - creates a JFrame of the game
 * Player - creates Player so it can move
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Main {

    private static FieldFrame frame = new FieldFrame();
//    private static GameField gameField = new GameField();
//    private static OptionsPanel optionsField = new OptionsPanel();
    private static JPanel mainPanel = new JPanel();

    private static OptionPanel kip = new OptionPanel();





    public static void main(String[] args) {
//        mainPanel.add(gameField);
//        mainPanel.add(optionsPanel);
//        frame.add(mainPanel);
        frame.setVisible(true);
        kip.setVisible(true);




    }




}
