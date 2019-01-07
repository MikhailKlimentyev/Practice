package headfirst.decorator;

/**
 * Decaf.
 * Конкретный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.desctiprion = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
