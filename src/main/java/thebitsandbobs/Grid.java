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

    public static Grid of(Life[][] lifeArray) {
        return new Grid(lifeArray);
    }

    public Life stateOf(int x, int y) {
        if ((x < 0 || x >= lifeGrid.length) || (y < 0 || y >= lifeGrid[0].length)) {
            return new Life(); //it out of range :(
        }

        return new Life(lifeGrid[x][y]);
    }

    public Life[][] update() {
        Life[][] gird = getLifeGrid();
        Life[][] returnGird = gird.clone();
        for (int i = 0; i < gird.length; i++) {
            Life[] a = gird[i];
            for (int j = 0; j < a.length; j++) {
                returnGird[i][j].setState(Life.getUpdatedState(Grid.of(gird),i, j));
            }
        }

        lifeGrid = returnGird;
        return lifeGrid.clone();
    }

    public Life[][] getLifeGrid() {
        return lifeGrid.clone();
    }

    public Life[][] getLifeGridUnsafe() {
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
