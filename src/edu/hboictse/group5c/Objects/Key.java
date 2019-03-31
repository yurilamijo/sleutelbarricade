package edu.hboictse.group5c.Objects;

import javax.swing.*;

/**
 * van de key kan je de waarde meegeven. De key wordt in een tile opgeroepen, waardoor de image van de key in de tile komt te zitten.
 * key class of the game
 * contructor of the key class: The key gets de     , image get implemented into the key class. (with the TRY function )
 *
 * @author Alexsandy Richardson
 */

public class Key extends GameObject {

    private int code;

    public Key(int code) {
        super(0, 0);
        this.code = code;
        this.setKeyImage();
    }

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

    public int getCode() {
        return code;
    }
}
