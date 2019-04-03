package edu.hboictse.group5c.GameField;

/**
 * Level Class
 *
 * @author Yuri Lamijo / Niels van Schaik
 * @version 0.1
 */
public class Level {

    private int[][] blocks;
    private int levelNumber;

    /**
     * Constructor of Level
     *
     * @param levelNumber Integer with the levelNumber
     */
    public Level(int levelNumber) {
        this.levelNumber = levelNumber;
        this.setLevel();
    }

    /**
     * Makes the level by levelNumber
     * <p>
     * 0 -> Tile
     * 1 -> Wall
     * 2 -> Barricade 100
     * 3 -> Barricade 200
     * 4 -> Barricade 300
     * 5 -> Key 100
     * 6 -> Key 100
     * 7 -> Key 100
     * 8 -> EndTile
     * 9 -> Player
     */
    private void setLevel() {
        switch (this.levelNumber) {
            case 1:
                this.blocks = new int[][]{
                        {9, 1, 2, 0, 0, 0, 1, 2, 2, 2},
                        {0, 3, 3, 0, 5, 7, 1, 2, 2, 2},
                        {0, 3, 2, 0, 0, 0, 0, 4, 4, 5},
                        {0, 1, 2, 0, 0, 0, 0, 4, 3, 3},
                        {0, 1, 1, 3, 0, 0, 1, 3, 2, 4},
                        {0, 3, 1, 3, 3, 4, 4, 2, 4, 0},
                        {0, 1, 2, 4, 3, 2, 4, 2, 4, 0},
                        {6, 1, 2, 1, 3, 2, 3, 4, 0, 0},
                        {0, 1, 2, 1, 4, 4, 0, 0, 1, 1},
                        {0, 1, 2, 2, 0, 1, 0, 0, 0, 8}
                };
                break;
            default:
                this.blocks = null;
                break;
        }
    }

    /**
     * Sets the next level
     */
    public void nextLevel() {
        this.levelNumber += 1;
        setLevel();
    }

    public int[][] getBlocks() {
        return this.blocks;
    }

    public int getLevelNumber() {
        return this.levelNumber;
    }
}
