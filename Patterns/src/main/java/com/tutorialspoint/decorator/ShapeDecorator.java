package com.tutorialspoint.decorator;

/**
 * ShapeDecorator.
 * Абстрактный декоратор.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
}
