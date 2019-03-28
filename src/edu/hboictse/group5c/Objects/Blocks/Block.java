package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.GameObject;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Block extends GameObject {

    private GameObject gameObject;

    /**
     * Constructor of Block with X and Y positions
     * @param x Position of Block
     * @param y Position of Block
     */
    public Block(int x, int y) {
        super(x, y);
    }

    /**
     * Checks if Block has a GameObject and then returns a boolean
     * @return A boolean if Block has a GameObject
     */
    public boolean hasGameObject() {
        return this.gameObject != null;
    }

    /**
     * Returns a GameObject if Block has one
     * @return GameObject of the Block
     */
    public GameObject getGameObject() {
        return gameObject;
    }

    /**
     * Sets a GameObject of Block
     * @param gameObject GameObject of Block
     */
    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}
