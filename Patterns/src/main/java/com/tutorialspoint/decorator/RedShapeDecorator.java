package com.tutorialspoint.decorator;

/**
 * RedShapeDecorator.
 * Конкретный декоратор -- декорирует конкретный компонент.
 *
 * @author Mikhail Klimentyev
 * @version $Id$
 * @since 01/07/2019
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        this.setRedBorder(this.decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
