package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.*;
import edu.hboictse.group5c.Objects.Blocks.*;
import edu.hboictse.group5c.Objects.Key;

import javax.swing.*;

public class Levels extends JPanel {
    private int level;

    private Block[][] empty = new Block[0][0];
    private Block[][] level1 = new Block[10][10];

    public Levels(int lvl) {
        this.level = lvl;
    }

    public Block[][] getLevel() {
        switch (level) {
            case 1 : return buildLevel1();
            default: return empty;
        }
    }

    private Block[][] buildLevel1() {
        /**
         * level 1 = 10x10
         *
         * T = Tile, TK = Tile with key, B = Barricade, W = wall, E = EndTile
         *
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
         *
         * total of 45 tiles
         * total of 4 tiles with key
         * total of 17 walls
         * total of 33 barricades
         * total of 1 End tile
         */

        level1 = new Block[][] {
                    new Block[]{
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Barricade(30),
                            new Barricade(70),
                            new Barricade(90)
                    },
                    new Block[]{
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Tile(new Key(100)),
                            new Tile(new Key(300)),
                            new Tile(),
                            new Barricade(90),
                            new Barricade(40),
                            new Barricade(90)
                    },
                    new Block[]{
                            new Tile(),
                            new Tile(),
                            new Barricade(100),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Barricade(300),
                            new Barricade(300),
                            new Tile(new Key(100))
                    },
                    new Block[]{
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Barricade(190),
                            new Barricade(90),
                            new Barricade(90)
                    },
                    new Block[]{
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Barricade(100),
                            new Wall(),
                            new Wall(),
                            new Wall(),
                            new Barricade(220),
                            new Barricade(100),
                            new Barricade(50)
                    },
                    new Block[]{
                            new Tile(),
                            new Barricade(200),
                            new Barricade(100),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Barricade(360),
                            new Tile()
                    },
                    new Block[]{
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Wall(),
                            new Wall(),
                            new Barricade(300),
                            new Wall(),
                            new Wall(),
                            new Tile(),
                            new Tile()
                    },
                    new Block[]{
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Barricade(300),
                            new Barricade(500),
                            new Barricade(100),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Tile()
                    },
                    new Block[]{
                            new Tile(new Key(200)),
                            new Wall(),
                            new Barricade(100),
                            new Barricade(50),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Wall(),
                            new Tile(),
                            new Tile()
                    },
                    new Block[]{
                            new Tile(),
                            new Wall(),
                            new Barricade(100),
                            new Barricade(150),
                            new Tile(),
                            new Tile(),
                            new Tile(),
                            new Wall(),
                            new Tile(),
                            new EndTile()
                    }
                };
        return level1;
    }
}
