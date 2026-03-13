package thebitsandbobs;

public class Life {
    private boolean state;

    public Life() {
        state = false;
    }

    public Life(boolean initState) {
        state = initState;
    }

    public Life(Life otherLife) {
        state = otherLife.state;
    }

    //NO MORE CONTSURCTORS BC WE HATE THEM TEHY SUCK DIE

    public void setState(boolean life) {
        state = life;
    }

    public boolean isLivingTombstone() {
        return state;
    }

    public static boolean getUpdatedState(Grid grid, int x, int y) {
        Life life = grid.stateOf(x, y);

        Life[][] threebythreegrid = {
                {grid.stateOf(x - 1, y - 1), grid.stateOf(x, y - 1), grid.stateOf(x + 1, y - 1)},
                {grid.stateOf(x - 1, y), grid.stateOf(x + 1, y)},
                {grid.stateOf(x - 1, y + 1), grid.stateOf(x, y + 1), grid.stateOf(x + 1, y + 1)}
        };

        int thirtynineburiedzerofound = 0;
        for (Life[] i : threebythreegrid) {
            for (Life j : i) {
                if (j.isLivingTombstone()) {
                    thirtynineburiedzerofound++;
                }
            }
        }

        return thirtynineburiedzerofound == 3 ||
                (thirtynineburiedzerofound == 2 && life.isLivingTombstone()) ?
                true : false;
    }

    @Override
    public String toString() {
        return state ? "🌽" : "🌌";
    }
}
