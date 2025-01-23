import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;

public class Eryk extends BeerConsumer {

    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
        if (beerBottle.getVolumeInLiters() > 0.5 || beerBottle.getAlcoholContentInPercent() > 6 || getBloodAlcoholContentInLiters() > 0.120) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean b) {
        if (b) {
            return new TrickThePoliceman(beerBottle);
        } else {
            return beerBottle;
        }
    }
}