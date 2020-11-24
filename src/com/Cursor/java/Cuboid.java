package com.Cursor.java;

public class Cuboid extends SpaceShape {
    private double depth;
    private double width;
    private double height;

    public Cuboid(Vertex3D main, double depth, double width, double height) {
        vertexListOfVertices.add(main);
        this.depth = depth;
        this.height = height;
        this.width = width;
    }




    @Override
    public double areaOfFigures() {
        return ((height * depth) + (height * width) + (depth * width)) * 2;
    }

    @Override
    public double volumeOfFigures() {
        return height + depth + width;
    }

    @Override
    public String toString() {
        return "The main of cuboid " + vertexListOfVertices + "\nDepth of Cuboid " + this.depth + "\nWidth of Cuboid " + this.width  + "\nHeight of Cuboid " + this.height + "\nArea of Cuboid " + areaOfFigures() + "\nVolume of Cuboid " + volumeOfFigures();
    }
}


