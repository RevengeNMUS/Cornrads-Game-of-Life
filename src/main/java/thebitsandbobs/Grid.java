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

    public static Life[][] deepCopy(Life[][] lifers) {
        Life[][] returnGird = new Life[lifers.length][];
        for (int i = 0; i < lifers.length; i++) {
            returnGird[i] = new Life[lifers[i].length];
            for (int j = 0; j < lifers[i].length; j++) {
                returnGird[i][j] = new Life(lifers[i][j]);
            }
        }

        return returnGird;
    }

    public Life[][] update() {
        Life[][] gird = getLifeGrid();
        Life[][] returnGird = Grid.deepCopy(gird);

        for (int i = 0; i < gird.length; i++) {
            Life[] a = gird[i];
            for (int j = 0; j < a.length; j++) {
                returnGird[i][j].setState(Life.getUpdatedState(Grid.of(gird),i, j));
            }
        }

        lifeGrid = returnGird;
        return deepCopy(returnGird);
    }

    public Life[][] getLifeGrid() {
        return deepCopy(lifeGrid);
    }

    public Life[][] getLifeGridUnsafe() {
        return lifeGrid;
    }

    public boolean nothingontheiniside(){
        for (Life[] i : lifeGrid) {
            for (Life j : i) {
                if (j.isLivingTombstone())
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();

        for (Life[] i : getLifeGrid()) {
            returnString.append(Arrays.toString(i)).append("\n");
        }

        return returnString.toString();
    }
}
