package edu.hboictse.group5c.Objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//* van de key kan je de waarde meegeven. De key wordt in een tile opgeroepen, waardoor de image van de key in de tile komt te zitten.




public class Key {


   private int Code;
   private BufferedImage image;


    public Key(int Code){
        this.Code = Code;

        try {
            this.image = ImageIO.read(new File("Images/Key.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public int getCode(){
        return Code;
 }

    public void setCode(int Code){
    this.Code = Code ;
 }

    public Image getImage() {
        return this.image.getScaledInstance(80, 80, Image.SCALE_FAST);
    }

}
