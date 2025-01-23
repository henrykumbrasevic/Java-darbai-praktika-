import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.BeerFactory;
import itadesign.test.AbstractBeerTest;

public class BeerTest extends AbstractBeerTest {
    @Override
    protected BeerFactory getBeerFactory() {
        return new Blindos();
    }

    @Override
    protected BeerConsumer getBeerConsumer() {
        return new Eryk();
    }
}
