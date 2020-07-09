package com.lijingrong.iterator;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private final Shape[] shapes;
    private int position;

    public ShapeIterator(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        return position <= shapes.length - 1 && shapes[position] != null;
    }

    @Override
    public Shape next() {
        return shapes[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalArgumentException("Illegal position");
        }
        for (int i = position - 1; i < shapes.length - 1; i++) {
            shapes[i] = shapes[i + 1];
        }
        shapes[shapes.length - 1] = null;
    }
}
