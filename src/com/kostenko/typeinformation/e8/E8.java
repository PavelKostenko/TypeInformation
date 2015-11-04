/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e8;

import java.util.ArrayList;

/**
 *
 * @author pavel
 */
public class E8 {
    static void printFather(Class child){
        Class parent = child.getSuperclass();
        String parentName = parent.getSimpleName();
        if (parentName.equals("Object")){
            System.out.println("Object");
        } else {
            System.out.println(parentName);
            printFather(parent);
        }
    }
    public static void main(String[] args) {
        printFather(new ArrayList().getClass());
    }
}
