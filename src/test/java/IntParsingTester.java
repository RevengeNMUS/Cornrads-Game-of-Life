import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import thebitsandbobs.Grid;
import thebitsandbobs.Life;
import thebitsandbobs.Mmmmmap;

import java.util.Arrays;

public class IntParsingTester {

    Life LIVING = new Life(true);
    Life DEAD = new Life(false);


    @Test
    public void testizationbasic() {
       int[] parsed = {Integer.parseInt("1001", 2),
               Integer.parseInt("1101", 2),
               Integer.parseInt("0001", 2)};
       int[] actual = {9, 13,1};
       Assertions.assertTrue(Arrays.equals(parsed, actual));
   }
   @Test
   public void testizatinggrid () {
       Assertions.assertTrue((Mmmmmap.toGrid(new int[]{9, 13, 1}).toString()).equals(
               Grid.of(new Life[][]{
                       {LIVING, DEAD, DEAD, LIVING},
                       {LIVING, LIVING, DEAD, LIVING},
                       {DEAD, DEAD, DEAD, LIVING}
               }).toString()));
   }
}
