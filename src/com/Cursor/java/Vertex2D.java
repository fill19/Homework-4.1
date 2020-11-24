package com.Cursor.java;

public class Vertex2D extends Vertices {
    public double y;

    public Vertex2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getVertex2D() {
        return y;

    }

    @Override
    public String toString() {
        return "Vertex2D: " + " x = " + getVertices() + ", y = " + y ;

    }
}
