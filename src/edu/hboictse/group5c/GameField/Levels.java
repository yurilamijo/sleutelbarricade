package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Assets.Blocks.*;

public class Levels {
    private Block[][] empty = new Block[0][0];
    private Block[][] level1 = new Block[10][10];

    public Block[][] getLevel(int lvl){
        return buildLevel(lvl);
    }

    private Block[][] buildLevel(int lvl) {
        switch (lvl) {
//            case 1 : buildLevel1();
            default: return empty;
        }
    }

//    private Field buildLevel1() {
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



//        level1 = new Block[][]
//                {},
//                {},
//                {},
//                {},
//                {1,2,3,4,5,6,7,8,9,0},
//                {1,2,3,4,5,6,7,8,9,0},
//                {1,2,3,4,5,6,7,8,9,0},
//                {1,2,3,4,5,6,7,8,9,0},
//                {1,2,3,4,5,6,7,8,9,0},
//                {1,2,3,4,5,6,7,8,9,0};
//    }
}
