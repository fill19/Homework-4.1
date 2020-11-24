package com.Cursor.java;

public class Vertex3D extends Vertex2D {
    public double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getVertex3D() {
          return z;
    }
    @Override
    public String toString() {
        return "Vertex3D: " + "x = " + getVertices() +  ", y = " + getVertex2D() + ", z = " + z ;


    }
}
