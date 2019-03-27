package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.GameObject;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Block extends GameObject {

    private GameObject gameObject;

    public Block(int x, int y) {
        super(x, y);
    }

    public boolean hasGameObject() {
        return this.gameObject != null;
    }

    public GameObject getGameObject() {
        return gameObject;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}
