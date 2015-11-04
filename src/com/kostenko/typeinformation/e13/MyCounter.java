/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e13;

import typeinfo.*;
/**
 *
 * @author pavel
 */
public class MyCounter {
    public static void main(String[] args) {
        TypeCounter tC = new TypeCounter(Part.class);
        for (int i=0;i<10;i++){
            Part p = Part.createRandom();
            System.out.println(p);
            tC.count(p);
        }
        System.out.println("***********");
        System.out.println(tC);
    }
}
