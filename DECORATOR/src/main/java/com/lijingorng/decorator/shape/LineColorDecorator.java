package com.lijingorng.decorator.shape;


public class LineColorDecorator extends ShapeDecorator {

    protected Color color;

    public LineColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line color:" + color);
    }

    @Override
    public void resize() {
        shape.resize();
    }

    @Override
    public String description() {
        return shape.description() + " drawn with " + color + " color.";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}
