package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.*;
import edu.hboictse.group5c.Objects.Key;

/**
 * level 1 = 10x10
 *
 * T = Tile, TK = Tile with key, B = Barricade, W = wall, E = EndTile
 *
 * total of 45 tiles
 * total of 4 tiles with key
 * total of 17 walls
 * total of 33 barricades
 * total of 1 End tile
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
 */

public class Level1 {
    private Tile[] tiles;
    private Wall[] walls;
    private Barricade[] barricades;
    private EndTile endTile;

    public Level1() {
        this.tiles = buildTiles();
        this. walls = buildWalls();
        this.barricades = buildBarricades();
        this.endTile = new EndTile(9,9,70);
    }

    public String getObjectType(int x, int y) {
        for (int i = 0; i < tiles.length; i++) {
            if(tiles[i].getPosX() == x && tiles[i].getPosY() == y) {
                return "tile";
            }
        }
        for (int i = 0; i < walls.length; i++) {
            if(walls[i].getPosX() == x && walls[i].getPosY() == y) {
                return "wall";
            }
        }
        for (int i = 0; i < barricades.length; i++) {
            if(barricades[i].getPosX() == x && barricades[i].getPosY() == y) {
                return "barricade";
            }
        }
        return "endtile";
    }

    public Tile getTile(int x,int y) {
        for (int i = 0; i < tiles.length; i++) {
            if(tiles[i].getPosX() == x && tiles[i].getPosY() == y) {
                return tiles[i];
            }
        }
        return new Tile(0,0,70);
    }

    public Wall getWall(int x, int y) {
        for (int i = 0; i < walls.length; i++) {
            if(walls[i].getPosX() == x && walls[i].getPosY() == y) {
                return walls[i];
            }
        }
        return new Wall(0,0,70);
    }

    private Tile[] buildTiles() {
        return new Tile[] {
                new Tile(0,0,70),
                new Tile(3,0,70),
                new Tile(4,0,70),
                new Tile(5,0,70),
                new Tile(6,0,70),

                new Tile(0,1,70),
                new Tile(1,1,70),
                new Tile(2,1,70),
                new Tile(3,1,70),
                new Tile(4,1,70, new Key(100)),
                new Tile(5,1,70, new Key(300)),
                new Tile(6,1,70),

                new Tile(0,2,70),
                new Tile(1,2,70),
                new Tile(3,2,70),
                new Tile(4,2,70),
                new Tile(5,2,70),
                new Tile(6,2,70),
                new Tile(9,2,70,new Key(100)),

                new Tile(0,3,70),
                new Tile(3,3,70),
                new Tile(4,3,70),
                new Tile(5,3,70),
                new Tile(6,3,70),

                new Tile(0,4,70),

                new Tile(0,5,70),
                new Tile(3,5,70),
                new Tile(4,5,70),
                new Tile(5,5,70),
                new Tile(9,5,70),

                new Tile(0,6,70),
                new Tile(8,6,70),
                new Tile(9,6,70),

                new Tile(0,7,70),
                new Tile(6,7,70),
                new Tile(7,7,70),
                new Tile(8,7,70),
                new Tile(9,7,70),

                new Tile(0,8,70,new Key(200)),
                new Tile(4,8,70),
                new Tile(5,8,70),
                new Tile(6,8,70),
                new Tile(8,8,70),
                new Tile(9,8,70),

                new Tile(0,9,70),
                new Tile(4,9,70),
                new Tile(5,9,70),
                new Tile(6,9,70),
                new Tile(8,9,70)
        };
    }

    private Wall[] buildWalls() {
        return new Wall[]{
                new Wall(1,0,70),

                new Wall(1,3,70),

                new Wall(1,4,70),
                new Wall(4,4,70),
                new Wall(5,4,70),
                new Wall(6,4,70),

                new Wall(6,5,70),

                new Wall(1,6,70),
                new Wall(3,6,70),
                new Wall(4,6,70),
                new Wall(6,6,70),
                new Wall(7,6,70),

                new Wall(1,7,70),

                new Wall(1,8,70),
                new Wall(7,8,70),

                new Wall(1,9,70),
                new Wall(7,9,70)
        };
    }

    private Barricade[] buildBarricades() {
        return new Barricade[]{
                new Barricade(2,0,70,100),
                new Barricade(7,0,70,30),
                new Barricade(8,0,70,70),
                new Barricade(9,0,70,90),

                new Barricade(7,1,70,90),
                new Barricade(8,1,70,40),
                new Barricade(9,1,70,90),

                new Barricade(2,2,70,100),
                new Barricade(7,2,70,300),
                new Barricade(8,2,70,300),

                new Barricade(2,3,70,100),
                new Barricade(7,3,70,190),
                new Barricade(8,3,70,90),
                new Barricade(9,3,70,90),

                new Barricade(2,4,70,100),
                new Barricade(3,4,70,100),
                new Barricade(7,4,70,220),
                new Barricade(8,4,70,100),
                new Barricade(9,4,70,50),

                new Barricade(1,5,70,200),
                new Barricade(2,5,70,100),
                new Barricade(7,5,70,100),
                new Barricade(8,5,70,360),

                new Barricade(2,6,70,100),
                new Barricade(5,6,70,300),

                new Barricade(2,7,70,100),
                new Barricade(3,7,70,300),
                new Barricade(4,7,70,500),
                new Barricade(5,7,70,100),

                new Barricade(2,8,70,100),
                new Barricade(3,8,70,50),

                new Barricade(2,9,70,100),
                new Barricade(3,9,70,150)
        };
    }
}
