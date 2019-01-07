package com.tutorialspoint.decorator;

/**
 * Circle.
 * Конкретный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
