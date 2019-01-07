package com.tutorialspoint.decorator;

/**
 * DecoratorPatternDemo.
 * Класс демонстрирует работу паттерна Декоратор.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println(String.format("%nCircle of red border"));
        redCircle.draw();

        System.out.println(String.format("%nRectangle of red border"));
        redRectangle.draw();
    }
}
