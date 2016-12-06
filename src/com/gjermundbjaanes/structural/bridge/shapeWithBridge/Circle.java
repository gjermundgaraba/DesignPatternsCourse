package com.gjermundbjaanes.structural.bridge.shapeWithBridge;

public class Circle extends Shape {

    public Circle(Color red) {
        super(red);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }

}
