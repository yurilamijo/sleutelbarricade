package edu.hboictse.group5c.Objects;

import javax.swing.*;

/**
 * Key class of the game
 * @author Alexsandy Richardson
 * @version 1.0
 */
public class Key extends GameObject {

    private int code;

    /**
     * Constructor of Key
     *
     * @param code Integer code of the Key
     */
    public Key(int code) {
        super(0, 0);
        this.code = code;
        this.setKeyImage();
    }

    /**
     * Sets the right Key image by code
     */
    private void setKeyImage() {
        switch (this.code) {
            case 100:
                super.setImage(new ImageIcon("Images/Key_100.png"));
                break;
            case 200:
                super.setImage(new ImageIcon("Images/Key_200.png"));
                break;
            case 300:
                super.setImage(new ImageIcon("Images/Key_300.png"));
                break;
            default:
                System.out.println("Image is NULL -> ERROR !!!");
                break;
        }
    }

    /**
     * Returns the code of the Key
     *
     * @return Integer of code
     */
    public int getCode() {
        return code;
    }
}
