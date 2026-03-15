package thebitsandbobs;

import java.util.ArrayList;

public class Mmmmmap {
    public static Grid toGrid (int[] listofnnumbers) {
        ArrayList<String> sillystrung = new ArrayList<>();
        int maxLen = 0;

        for (int i : listofnnumbers) {
            sillystrung.add(Integer.toBinaryString(i));
            maxLen = Math.max(maxLen, Integer.toBinaryString(i).length());
        }

        int finalMaxLen = maxLen;
        sillystrung.replaceAll(s -> "0".repeat(finalMaxLen - s.length()) + s);

        Life[][] sillybilly = new Life[listofnnumbers.length][maxLen];

        for (int i = 0; i < listofnnumbers.length; i++) {
            String[] hehehaw = sillystrung.get(i).split("");
            for (int j = 0; j < hehehaw.length; j++) {
                sillybilly[i][j] = new Life(Integer.parseInt(hehehaw[j]) == 1 ? true : false);
            }
        }

        return Grid.of(sillybilly);
    }
}
