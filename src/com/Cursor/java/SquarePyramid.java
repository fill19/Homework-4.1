package com.Cursor.java;

public class SquarePyramid extends SpaceShape {
    private double height;
    private double length;

    public SquarePyramid(Vertex3D main, double edge, double length) {
        vertexListOfVertices.add(main);
        this.height = edge;
        this.length = length;
    }



    @Override
    public double areaOfFigures() {
        return Math.pow(height, 2) + 2 * height * (Math.sqrt(Math.pow(length, 2) - (Math.pow(height, 2) / 4)));
    }

    @Override
    public double volumeOfFigures() {
        return ((length * length) * height) / 3;
    }

    @Override
    public String toString() {
        return "The main of Square pyramid - " + vertexListOfVertices + "\nEdge of Square pyramid -  " + this.height + "\nLength of the sides - " + this.length + "\nArea of Square pyramid -  " + areaOfFigures() + "\nVolume of the Square pyramid - " + volumeOfFigures();
    }
}
