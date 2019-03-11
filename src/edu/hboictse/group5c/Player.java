package edu.hboictse.group5c;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player {

//    private static final int NORTH = 0;
//    private static final int SOUTH = 180;
//    private static final int EAST = 90;
//    private static final int WEST = 270;

    private int x;
    private int y;
//    private int direction;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
//        this.direction = 90;
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveRight() {
        this.x++;
    }

    public void moveLeft() {
        this.x--;
    }

    public void pickUpKey(){

    }

    public void removeKey(){

    }

    public int getPositionX() {
        return x;
    }

    public int getPositionY() {
        return y;
    }
}
