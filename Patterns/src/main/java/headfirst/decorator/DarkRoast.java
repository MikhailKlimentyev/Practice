package headfirst.decorator;

/**
 * DarkRoast.
 * Конкретный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.desctiprion = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
