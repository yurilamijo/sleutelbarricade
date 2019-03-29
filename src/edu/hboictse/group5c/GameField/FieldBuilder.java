package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.*;
import javax.swing.*;
import java.awt.*;

public class FieldBuilder extends JPanel {

    private GameObject[][] level;

    public FieldBuilder(GameObject[][] level) {
        this.level = level;
        createField();
        setLayout(new GridLayout(level.length,level[0].length));
    }

    private void createField() {
        resetPositions();
        addLevel();
    }

    private void resetPositions() {
        for (int x = 0; x < this.level.length; x++) {
            for (int y = 0; y < this.level[x].length; y++) {
                this.level[x][y].setPosX(y);
                this.level[x][y].setPosY(x);
            }
        }
    }

    private void addLevel() {
        for (int x = 0; x < this.level.length; x++) {
            for (int y = 0; y < this.level[x].length; y++) {
                add(this.level[x][y]);
                setIcon(this.level[x][y]);
            }
        }
    }

    /**
     * Sets image of GameObject
     * @param gameObject
     */
    public static void setIcon(GameObject gameObject) {
        ImageIcon icon = gameObject.getImage();

        if (icon == null) {
            gameObject.setIcon(null);
            return;
        }

        Image image = icon.getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        gameObject.setIcon(new ImageIcon(image));
    }

    public GameObject[][] getField() {
        return level;
    }
}
