package com.lijingorng.decorator.shape;


public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle style;

    public LineStyleDecorator(Shape shape, LineStyle style) {
        super(shape);
        this.style = style;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line Style: " + style);
    }

    @Override
    public void resize() {
        shape.resize();
    }

    @Override
    public String description() {
        return shape.description() + " drawn with " + style + " lines.";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}
