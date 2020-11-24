package com.Cursor.java;

public class Sphere extends SpaceShape {
    public double radius;

    public Sphere(Vertex3D main, double radius) {
        vertexListOfVertices.add(main);
        this.radius = radius;
    }

    public void getSphere (double radius, Vertex3D main) {
        vertexListOfVertices.add(main);
        this.radius = radius;

    }

    @Override
    public double areaOfFigures() {
        return Math.PI*(Math.pow(radius, 2))*4;
    }

    @Override
    public double volumeOfFigures() {
        return (4 * 3 * Math.PI * (Math.pow(radius, 3))) / 3 ;
    }
    @Override
    public String toString() {
        return "The main sphere - " +  vertexListOfVertices + "\nRadius of Sphere " +  this.radius + "\nArea of Sphere " + areaOfFigures() + "\nVolume of Sphere " + volumeOfFigures();
    }
}
