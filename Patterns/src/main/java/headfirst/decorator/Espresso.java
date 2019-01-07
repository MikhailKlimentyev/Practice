package headfirst.decorator;

/**
 * Espresso.
 * Конкретный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.desctiprion = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
