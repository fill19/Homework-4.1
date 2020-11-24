package com.Cursor.java;

import static java.lang.Math.PI;

public class Circle extends PlaneShape {
   private double radius;

    public Circle(Vertex2D v, double radius) {
        this.radius = radius;
    }


    public double Circle() {
        return radius;
    }

    @Override
    public double areaOfFigures() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeterOfFigures() {
        return  Math.PI * radius * 2 ;
    }
    @Override
    public String toString(){
        return "The circle radius - " + this.radius + "\nArea of Circle " + areaOfFigures() + "\nPerimeter of Circle " + perimeterOfFigures() ;
    }
}
