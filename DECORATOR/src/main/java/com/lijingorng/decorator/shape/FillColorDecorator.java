package com.lijingorng.decorator.shape;


public class FillColorDecorator extends ShapeDecorator {

    protected Color color;

    public FillColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Fill color:" + color);
    }

    @Override
    public void resize() {
        shape.resize();
    }

    @Override
    public String description() {
        return shape.description() + " filled with " + color + " color.";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}
