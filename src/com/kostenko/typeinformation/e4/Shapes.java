/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e4;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pavel
 */
abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {

    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {

    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList) {
            shape.draw();
        }
        
        Shape s = new Rhomboid();
        System.out.println("Shape: " + s);
        if (s instanceof Rhomboid){
            Rhomboid rb = (Rhomboid)s;
            System.out.println("The shape is Rhomboid: "+ rb);
        }
        if (s instanceof Circle){
            Circle c = (Circle)s;
            System.out.println("Circle: "+ c);
        } else {
            System.out.println("The shape is not a circle");
        }
        
        

    }
}
