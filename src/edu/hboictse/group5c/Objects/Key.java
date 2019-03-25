package edu.hboictse.group5c.Objects;

import javax.swing.*;

//* van de key kan je de waarde meegeven. De key wordt in een tile opgeroepen, waardoor de image van de key in de tile komt te zitten.
public class Key extends GameObject {

   private int Code;

    public Key(int Code){
        super(0,0);
        this.Code = Code;

        super.setImage(new ImageIcon("Images/Key.png"));
    }

    public int getCode(){
        return Code;
 }

    public void setCode(int Code){
    this.Code = Code ;
 }
}
