import thebitsandbobs.Grid;
import thebitsandbobs.Life;

import java.util.ArrayList;
import java.util.Arrays;

public class Mmmmmap {
    public static Grid toGrid (int[] listofnnumbers) {
        ArrayList<String> sillystrung = new ArrayList<>();
        for (int i : listofnnumbers) {
            sillystrung.add(Integer.toBinaryString(i));
        }

        Life[][] sillybilly = new Life[sillystrung.getFirst().length()][listofnnumbers.length];

        for (int i = 0; i < listofnnumbers.length; i++) {
            String[] hehehaw = sillystrung.get(i).split("");
            for (int j = 0; j < hehehaw.length; j++) {
                sillybilly[j][i] = new Life(Integer.parseInt(hehehaw[j]) == 1 ? true : false);
            }
        }

        return Grid.of(sillybilly);
    }
}
