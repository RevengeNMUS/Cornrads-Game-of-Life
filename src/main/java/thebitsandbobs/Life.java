package thebitsandbobs;

public class Life {
    private boolean state;

    public Life() {
        state = false;
    }

    public Life(boolean initState) {
        state = initState;
    }

    //NO MORE CONTSURCTORS BC WE HATE THEM TEHY SUCK DIE

    public void kill() {
        state = false;
    }

    public void live() {
        state = true;
    }

    public void setState(boolean life) {
        state = life;
    }

    public static boolean getUpdatedState(Grid grid, int x, int y) {
        //DO SMTH FRFR HERE YOU CHUNGUS
        return false;
    }

    @Override
    public String toString() {
        return state ? "🌽" : "🌌";
    }
}
