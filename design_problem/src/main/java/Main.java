import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

public class Main {

    public static void main(String[] args) throws NoMoreMaltException {

        Blindos blindos = new Blindos();
        System.out.println(blindos.getMaltReserves());
        blindos.receiveMaltShippment(3.0);
        System.out.println(blindos.getMaltReserves());
        DefaultBeerBottle db = blindos.produceNextBeerBottle();
        System.out.println(blindos.getMaltReserves());
    }
}
