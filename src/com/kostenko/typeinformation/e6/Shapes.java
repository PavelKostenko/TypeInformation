/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e6;

/**
 *
 * @author pavel
 */
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pavel
 */
abstract class Shape {
    boolean highlighted = false;
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
    
    void setHighlight(boolean b){
        highlighted = b;
    }
    
}

class Circle extends Shape {

    public String toString() {
        return "Circle " + highlighted;
    }
}

class Square extends Shape {

    public String toString() {
        return "Square " + highlighted;
    }
}

class Triangle extends Shape {

    public String toString() {
        return "Triangle " + highlighted;
    }
}

class Rhomboid extends Shape {

    public String toString() {
        return "Rhomboid " + highlighted;
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
        System.out.println();
        System.out.println("highlight all trianlges:");
        for (Shape shape: shapeList){
            if (shape instanceof Triangle){
                shape.setHighlight(true);
            }
            System.out.println(shape);
        }
    }
}
