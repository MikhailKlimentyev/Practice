package headfirst.decorator;

/**
 * StarbuzzCoffee.
 * Класс демонстрирует работу паттерна Декоратор.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        // Оборачиваем объект DarkRoast в объект Mocha
        darkRoast = new Mocha(darkRoast);
        // Оборачиваем объект DarkRoast в объект Mocha
        darkRoast = new Mocha(darkRoast);
        // Оборачиваем объект DarkRoast в объект Whip
        darkRoast = new Whip(darkRoast);
        // Cсылка darkRoast ссылается на объект Whip, который содержит объект Mocha,
        // который содержит объект Mocha, который содержит объект DarkRoast,
        // т.о. объект DarkRoast динамически наделен возможностями объектов Mocha, Mocha и Whip.
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
