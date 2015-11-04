/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e10;

import java.lang.reflect.Field;

/**
 *
 * @author pavel
 */
public class E10 {
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
        char [] chars = {'a','b','c'};
        printFather(chars.getClass());
        char c = 'a';
    }
}
