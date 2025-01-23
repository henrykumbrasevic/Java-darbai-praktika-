import itadesign.beerdrinker.BeerBottle;

public class TrickThePoliceman implements BeerBottle {

    private BeerBottle beerBottle;

    public TrickThePoliceman(BeerBottle beerBottle) {
        this.beerBottle = beerBottle;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return 0.0;
    }

    @Override
    public double getVolumeInLiters() {
        return beerBottle.getVolumeInLiters();
    }

    @Override
    public void takeASip(double v) {
        beerBottle.takeASip(v);
    }
}
