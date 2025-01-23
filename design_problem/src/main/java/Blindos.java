import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

public class Blindos implements BeerFactory {

    private double maltReserves = 1;

    @Override
    public void receiveMaltShippment(double v) {
        maltReserves += v;
    }

    public double getMaltReserves() {
        return maltReserves;
    }

    public void setMaltReserves(double maltReserves) {
        this.maltReserves = maltReserves;
    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle() throws NoMoreMaltException {
        if (maltReserves < 0.024) {
            throw new NoMoreMaltException("Malt out of stock");
        } else {
            maltReserves -= 0.025;
            return new DefaultBeerBottle(0.5, 5);
        }
    }
}