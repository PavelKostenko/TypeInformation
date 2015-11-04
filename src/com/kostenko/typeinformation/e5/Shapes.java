/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e5;

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
    
    void rotate(){
        if (!(this instanceof Circle)){
            System.out.println("Rotated!");
        } else {
            System.out.println("No sense to rotate. It is circle!");
        }
    }
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
            shape.rotate();
        }
    }
}
