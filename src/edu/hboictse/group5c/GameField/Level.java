package edu.hboictse.group5c.GameField;

/**
 * Level Class
 *
 * @author Yuri Lamijo / Niels van Schaik / Alexsandy Richardson
 * @version 1.0
 */
public class Level {

    private int[][] blocks;
    private int levelNumber;
    private final int finalLevel = 6;

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
     * 6 -> Key 200
     * 7 -> Key 300
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
            case 2:
                this.blocks = new int[][]{
                        {9, 0, 0, 0, 0, 5, 0, 0, 0, 0},
                        {1, 1, 2, 2, 1, 1, 1, 3, 1, 3},
                        {0, 1, 2, 2, 1, 7, 1, 3, 1, 3},
                        {6, 1, 2, 2, 1, 2, 1, 4, 1, 3},
                        {0, 1, 2, 2, 1, 2, 1, 4, 1, 3},
                        {0, 1, 2, 3, 3, 3, 3, 4, 1, 3},
                        {0, 0, 0, 0, 0, 0, 0, 4, 1, 3},
                        {1, 1, 1, 1, 1, 1, 2, 2, 3, 3},
                        {3, 5, 3, 3, 3, 3, 2, 1, 1, 1},
                        {3, 3, 3, 2, 2, 2, 4, 4, 4, 8},
                };
                break;
            case 3:
                this.blocks = new int[][]{
                        {9, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 2, 1},
                        {0, 0, 0, 0, 0, 0, 7, 1, 6, 1},
                        {3, 4, 3, 0, 1, 2, 1, 1, 1, 1},
                        {4, 0, 0, 0, 0, 2, 2, 4, 4, 1},
                        {2, 0, 0, 0, 0, 0, 0, 1, 4, 1},
                        {2, 2, 2, 2, 1, 0, 1, 1, 2, 4},
                        {2, 3, 3, 2, 2, 0, 0, 5, 1, 4},
                        {1, 7, 4, 4, 2, 1, 0, 0, 1, 3},
                        {1, 1, 4, 5, 4, 1, 1, 1, 2, 8},
                };
                break;
            case 4:
                this.blocks = new int[][]{
                        {9, 7, 0, 0, 0, 0, 0, 1, 0, 6},
                        {7, 1, 4, 4, 4, 4, 4, 4, 4, 4},
                        {0, 4, 1, 3, 3, 3, 3, 3, 3, 1},
                        {2, 4, 0, 1, 2, 2, 2, 2, 0, 0},
                        {2, 4, 0, 3, 1, 3, 3, 2, 1, 0},
                        {2, 4, 0, 3, 2, 8, 3, 7, 3, 0},
                        {2, 4, 0, 3, 2, 2, 1, 2, 4, 4},
                        {2, 4, 0, 3, 3, 3, 3, 1, 5, 4},
                        {2, 4, 0, 1, 0, 0, 0, 0, 1, 5},
                        {1, 4, 0, 0, 0, 1, 0, 4, 6, 1},
                };
                break;
            case 5:
                this.blocks = new int[][]{
                        {9, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {3, 1, 1, 4, 4, 1, 1, 3, 1, 0},
                        {8, 2, 7, 0, 0, 0, 0, 0, 1, 7},
                        {1, 1, 1, 3, 0, 3, 3, 3, 1, 1},
                        {5, 1, 2, 0, 0, 0, 0, 0, 0, 0},
                        {4, 4, 0, 1, 1, 0, 0, 1, 1, 1},
                        {2, 2, 0, 2, 0, 0, 0, 0, 0, 0},
                        {4, 4, 0, 2, 0, 0, 0, 2, 1, 2},
                        {4, 1, 3, 1, 4, 3, 4, 2, 4, 4},
                        {0, 0, 0, 0, 0, 3, 3, 1, 4, 6},
                };
                break;
            case 6:
                this.blocks = new int[][]{
                        {9, 6, 3, 3, 3, 3, 3, 3, 3, 3},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 3},
                        {4, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {3, 0, 0, 0, 0, 0, 1, 2, 1, 3},
                        {3, 0, 0, 0, 0, 4, 1, 2, 1, 5},
                        {3, 4, 1, 3, 1, 2, 1, 3, 1, 3},
                        {3, 2, 1, 7, 1, 3, 1, 3, 1, 1},
                        {3, 2, 1, 6, 5, 7, 6, 5, 7, 6},
                        {4, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {3, 2, 4, 3, 2, 4, 3, 2, 0, 8},
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

    /**
     * Gets the currentLevelNumber
     *
     * @return Integer of the current levelNumber
     */
    public int getLevelNumber() {
        return this.levelNumber;
    }

    /**
     * Checks is player is on the final level
     *
     * @return Boolean of player is on the final level
     */
    public boolean checkFinalLevel() {
        return this.finalLevel == this.levelNumber;
    }

    /**
     * Returns the 2D array of Integers
     * More for testing purposes
     *
     * @return double Integer array
     */
    public int[][] getBlocks() {
        return this.blocks;
    }
}
