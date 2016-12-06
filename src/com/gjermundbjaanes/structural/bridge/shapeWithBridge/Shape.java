package com.gjermundbjaanes.structural.bridge.shapeWithBridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
