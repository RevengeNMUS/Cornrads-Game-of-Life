import thebitsandbobs.Grid;
import thebitsandbobs.MaxVerstappen;
import thebitsandbobs.Mmmmmap;

import static java.lang.Thread.sleep;

public class CrazySillyLIttolSample {
    public static void main(String[] args) {
        
        Grid grid = Mmmmmap.toGrid(new int[]{
                Integer.parseInt("1001", 2),
                Integer.parseInt("1101", 2),
                Integer.parseInt("0001", 2)
        });

        MaxVerstappen tudududu = new MaxVerstappen(grid);
        tudududu.startUpdatingYourPC(1000, true);
    }
}