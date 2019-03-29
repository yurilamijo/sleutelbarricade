package edu.hboictse.group5c.GameField;

public class Level {

    private int[][] blocks;
    private int levelNumber;

    /**
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
    public Level(int levelNumber) {
        this.levelNumber = levelNumber;
        this.setLevel();
    }

    private void setLevel() {
        switch (this.levelNumber) {
            case 1:
                this.blocks = new int[][]{
                        {9, 1, 2, 0, 0, 0, 0, 2, 2, 2},
                        {0, 0, 0, 0, 5, 7, 0, 2, 2, 2},
                        {0, 0, 2, 0, 0, 0, 0, 4, 4, 5},
                        {0, 1, 2, 0, 0, 0, 0, 4, 3, 3},
                        {0, 1, 2, 2, 0, 0, 0, 3, 2, 4},
                        {0, 3, 2, 0, 0, 4, 0, 2, 4, 0},
                        {0, 1, 2, 4, 3, 2, 0, 0, 0, 0},
                        {6, 1, 2, 2, 0, 0, 0, 0, 0, 0},
                        {0, 1, 2, 2, 0, 0, 0, 0, 0, 0},
                        {0, 1, 2, 2, 0, 0, 0, 0, 0, 8}
                };
                break;
            default:
                break;
        }
    }

    public void nextLevel() {
        this.levelNumber += 1;
    }

    public int[][] getBlocks() {
        return this.blocks;
    }
}
