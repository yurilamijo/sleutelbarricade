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
        resetSIZE();
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

    private void resetSIZE() {
        for (int x = 0; x < this.level.length; x++) {
            for (int y = 0; y < this.level[x].length; y++) {
                this.level[x][y].setBlockSize(70);
            }
        }
    }
    private void addLevel() {
        for (int x = 0; x < this.level.length; x++) {
            for (int y = 0; y < this.level[x].length; y++) {
                add(this.level[x][y]);
            }
        }
    }

    public GameObject[][] getField() {
        return level;
    }
}
