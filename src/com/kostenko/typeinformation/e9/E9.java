/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e9;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author pavel
 */
public class E9 {
    static void printFather(Class child){
        Class parent = child.getSuperclass();
        System.out.println("============");
        for (Field f: parent.getDeclaredFields()){
            System.out.println(f);
        }
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
