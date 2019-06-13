package com.lijingorng.decorator.shape;

public class LineThinknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThinknessDecorator(Shape shape, double thickness) {
        super(shape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line thickness: " + thickness);
    }

    @Override
    public void resize() {
        shape.resize();
    }

    @Override
    public String description() {
        return shape.description() + " drawn with line thickness " + thickness + ".";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}
