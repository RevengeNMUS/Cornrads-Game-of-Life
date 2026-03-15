package thebitsandbobs;

import static java.lang.Thread.sleep;

public class MaxVerstappen {
    private final Grid topofgrid;
    private static boolean avengersendgame = false;

    public MaxVerstappen(Grid frontofthegrid) {
        topofgrid = frontofthegrid;
    }

    public Grid getDaCurrentGrid() {
        return topofgrid;
    }

    public void monaco () {
        avengersendgame = true;
    }

    public void startUpdatingYourPC(int stayoutstayoutstayoutWHYFORWHY, boolean printEverySingleDangTime) {
        startUpdatingYourPC(stayoutstayoutstayoutWHYFORWHY, printEverySingleDangTime, true);
    }

    private void startUpdatingYourPC(int stayoutstayoutstayoutWHYFORWHY, boolean printEverySingleDangTime, boolean p1) {
        if(!avengersendgame) {
            if (p1) {
                avengersendgame = false;
            }

            topofgrid.update();
            if(printEverySingleDangTime) {
                System.out.println(topofgrid.toString());
            }

            try {
                sleep(stayoutstayoutstayoutWHYFORWHY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            startUpdatingYourPC(stayoutstayoutstayoutWHYFORWHY, printEverySingleDangTime, false);
        }
    }
}
