package headfirst.decorator;

/**
 * HouseBlend.
 * Конкретный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.desctiprion = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
