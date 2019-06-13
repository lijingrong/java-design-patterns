package com.lijingorng.decorator.shape;


public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        super();
        this.shape = shape;
    }

}
