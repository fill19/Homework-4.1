package com.Cursor.java;

public class Rectangle extends PlaneShape {
    private double height;
    private double width;

    public Rectangle(Vertex2D figures, double height, double width) {
        vertexListOfVertices.add(figures);
        this.height = height;
        this.width = width;

    }



    @Override
    public double areaOfFigures() {
        return width * height;
    }

    @Override
    public double perimeterOfFigures() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Height of Rectangle - " + this.height + " \nWidth of Rectangle - " + this.height + "\nPerimeter of Rectangle - " + perimeterOfFigures() + "\nArea of Rectangle - " + areaOfFigures();

    }

}
