package com.Cursor.java;



import java.util.ArrayList;
;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<Shape> theMainShape = new ArrayList<>();

        Vertex2D radius = new Vertex2D(4, 9);
        Rectangle getRectangle = new Rectangle(radius, 2, 4);

        Vertex2D firstVerticesOfTriangle  = new  Vertex2D(1, 3);
        Vertex2D secondVerticesOfTriangle = new  Vertex2D(4, 8);
        Vertex2D thirdVerticesOfTriangle = new  Vertex2D(5, 2);
        Triangle getTriangle = new Triangle(firstVerticesOfTriangle, secondVerticesOfTriangle, thirdVerticesOfTriangle);

        Circle getCircle = new Circle(radius, 8);

        Vertex3D main = new  Vertex3D(4, 7, 1);
        Sphere getSphere = new Sphere(main, 5);

        Cuboid getCuboid = new Cuboid(main, 4, 3.5, 8);

        SquarePyramid getPyramid = new SquarePyramid(main, 5, 3);


        theMainShape.add(getRectangle);
        theMainShape.add(getTriangle);
        theMainShape.add(getCircle);
        theMainShape.add(getSphere);
        theMainShape.add(getCuboid);
        theMainShape.add(getPyramid);

        for (Shape figures : theMainShape) {
            System.out.println(figures);
        }
    }

    }




