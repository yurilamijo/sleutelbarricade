package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;

public class Barricade extends Block {

    private int code;

    public Barricade(int code) {
        super(0, 0);
        this.code = code;
        this.setBarricadeImage();
    }

    private void setBarricadeImage() {
        switch (this.code) {
            case 100:
                super.setImage(new ImageIcon("Images/Barricade_100.png"));
                break;
            case 200:
                super.setImage(new ImageIcon("Images/Barricade_200.png"));
                break;
            case 300:
                super.setImage(new ImageIcon("Images/Barricade_300.png"));
                break;
            default:
                break;
        }
    }

    public int getCode() {
        return this.code;
    }
}
