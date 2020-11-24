package com.Cursor.java;

public class Triangle extends PlaneShape {


    public Triangle(Vertex2D firstVerticesOfTriangle, Vertex2D secondVerticesOfTriangle, Vertex2D thirdVerticesOfTriangle) {
        vertexListOfVertices.add(firstVerticesOfTriangle);
        vertexListOfVertices.add(secondVerticesOfTriangle);
        vertexListOfVertices.add(thirdVerticesOfTriangle);
    }




    private double setTriangle(Vertex2D first, Vertex2D second) {
        return Math.sqrt(Math.pow((first.getVertices() - second.getVertices()), 2) + Math.pow((first.getVertex2D() - second.getVertex2D()), 2));
    }

    @Override
    public double areaOfFigures() {
        double num1 = setTriangle((Vertex2D) vertexListOfVertices.get(1), (Vertex2D) vertexListOfVertices.get(2));
        double num2 = setTriangle((Vertex2D) vertexListOfVertices.get(1), (Vertex2D) vertexListOfVertices.get(2));
        double num3 = setTriangle((Vertex2D) vertexListOfVertices.get(1), (Vertex2D) vertexListOfVertices.get(2));
        double p = (num1 + num2 + num3) / 2;
        return Math.sqrt(p * (p - num1) * (p - num2) * (p - num3));
    }

    @Override
    public double perimeterOfFigures() {
        double num1 = setTriangle((Vertex2D) vertexListOfVertices.get(1), (Vertex2D) vertexListOfVertices.get(2));
        double num2 = setTriangle((Vertex2D) vertexListOfVertices.get(1), (Vertex2D) vertexListOfVertices.get(2));
        double num3 = setTriangle((Vertex2D) vertexListOfVertices.get(1), (Vertex2D) vertexListOfVertices.get(2));
        return num1 + num2 + num3;
    }

    @Override
    public String toString() {
        return "Triangle sides: " + vertexListOfVertices + " \nArea of Triangle -  " + areaOfFigures() + "  \nPerimeter of Triangle -  " + perimeterOfFigures()   ;
    }
}
