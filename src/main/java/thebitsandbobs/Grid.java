package thebitsandbobs;

import java.util.Arrays;

public class Grid {
    private Life[][] lifeGrid;

    public Grid() {
        //default 3x3 because susus amojgus
        lifeGrid =
                new Life[][]{
                        {new Life(), new Life(), new Life()},
                        {new Life(), new Life(), new Life()},
                        {new Life(), new Life(), new Life()}
        };
    }

    private Grid(Life[][] lifeGrid) {
        this.lifeGrid = lifeGrid;
    }

    public static Grid gridOf(Life[][] lifeArray) {
        return new Grid(lifeArray);
    }

    public Life[][] update() {
        return null;
    }

    public Life[][] getLifeGrid() {
        return lifeGrid;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "lifeGrid=" + Arrays.toString(lifeGrid) +
                '}';
        //MAKE ACTUAL THING
    }
}
