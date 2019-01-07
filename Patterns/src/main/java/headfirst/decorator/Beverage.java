package headfirst.decorator;

/**
 * Beverage.
 * Абстрактный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public abstract class Beverage {

    protected String desctiprion = "Unknown Beverage";

    public String getDescription() {
        return this.desctiprion;
    }

    public abstract double cost();
}
