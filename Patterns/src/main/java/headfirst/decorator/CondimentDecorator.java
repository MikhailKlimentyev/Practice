package headfirst.decorator;

/**
 * CondimentDecorator.
 * Абстрактный декоратор.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
