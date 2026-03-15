package thebitsandbobs;
import static thebitsandbobs.Life.*;

public class ExampleGrithds {
    public static final Grid SIMPLE_STABLE = Grid.of(new Life[][]{
            {CHUNGING, CHUNGING, LIVING, CHUNGING},
            {LIVING, LIVING, CHUNGING, CHUNGING},
            {CHUNGING, LIVING, CHUNGING, CHUNGING},
            {CHUNGING, CHUNGING, CHUNGING, CHUNGING}
    });

    public static final Grid SIMPLERSTABLERSTRONGERBETTERFASTER = Grid.of(new Life[][]{
            {CHUNGING, LIVING, CHUNGING},
            {CHUNGING, LIVING, CHUNGING},
            {CHUNGING, LIVING, CHUNGING}
    });
}
