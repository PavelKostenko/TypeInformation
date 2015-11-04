/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e12;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

/**
 *
 * @author pavel
 */
public class MyPetCounter {
    public static void main(String[] args) {
        TypeCounter tC = new TypeCounter(Coffee.class);
        CoffeeGenerator cG = new CoffeeGenerator(10);
        for (Coffee c: cG){
            System.out.println(c);
            tC.count(c);
        }
        System.out.println("************");
        System.out.println(tC);
    }
}
