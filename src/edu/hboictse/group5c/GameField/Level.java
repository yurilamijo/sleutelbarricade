package edu.hboictse.group5c.GameField;

public class Level {

    private int[][] barricades;
    private int[][] walls;
    private int[][] tiles;
    private int[][] keys;

    /**
     * T = Tile, TK = Tile with key, B = Barricade, W = wall, E = EndTile
     * <p>
     * 0     1    2    3    4     5     6  7    8    9
     * <p>
     * T     W    B100 T    T     T     T  B30  B70  B90
     * T     T    T    T    TK100 TK300 T  B90  B40  B90
     * T     T    B100 T    T     T     T  B300 B300 TK100
     * T     W    B100 T    T     T     T  B190 B90  B90
     * T     W    B100 B100 W     W     W  B220 B100 B50
     * T     B200 B100 T    T     T     W  B100 B360 T
     * T     W    B100 W    W     B300  W  W    T    T
     * T     W    B100 B300 B500  B100  T  T    T    T
     * TK200 W    B100 B50  T     T     T  W    T    T
     * T     W    B100 B150 T     T     T  W    T    E
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

    public Level() {
        this.tiles = new int[][]{
                {9, 1, 2, 0, 0, 0, 0, 2, 2, 2},
                {0, 0, 0, 0, 5, 7, 0, 2, 2, 2},
                {0, 0, 2, 0, 0, 0, 0, 4, 4, 5},
                {0, 1, 2, 0, 0, 0, 0, 4, 3, 3},
                {0, 1, 2, 2, 0, 0, 0, 3, 2, 4},
                {0, 3, 2, 0, 0, 4, 0, 2, 4, 0},
                {0, 1, 2, 4, 3, 2, 0, 0, 0, 0},
                {6, 1, 2, 2, 0, 0, 0, 0, 0, 0},
                {0, 1, 2, 2, 0, 0, 0, 0, 0, 8}
        };
    }

    public int[][] getTiles() {
        return this.tiles;
    }

    private void buildBarricades() {
        this.barricades = new int[][]{
                {0, 1}, {0, 7}, {0, 8}, {0, 9},
                {1, 7}, {1, 8}, {0, 9},
                {2, 2}, {2, 7}, {0, 8},
                {3, 2}, {3, 7}, {3, 8}, {3, 9},
                {4, 2}, {4, 3}, {4, 7}, {4, 8}, {4, 9},
                {5, 1}, {5, 2}, {5, 7}, {5, 8},
                {6, 2}, {6, 5},
                {7, 2}, {7, 3}, {7, 4}, {7, 5},
                {8, 2}, {8, 3},
                {9, 2}, {9, 3},
        };
    }

    private void buildWalls() {
        this.walls = new int[][]{
                {0, 1},
                {3, 1},
                {4, 1}, {4, 4}, {4, 5}, {4, 6},
                {5, 6},
                {6, 1}, {6, 3}, {6, 4}, {6, 6}, {6, 7},
                {7, 1},
                {8, 1}, {8, 7},
                {9, 1}, {8, 7},
        };
    }

    private void buildKeys() {
        this.keys = new int[][]{
                {1, 4}, {1, 5},
                {2, 9},
                {8, 0},
        };
    }
}
