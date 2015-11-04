//: generics/coffee/Coffee.java
package com.kostenko.typeinformation.e16;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Coffee {

    private static long counter = 0;
    private final long id = counter++;
    private static Random rand = new Random(47);
    
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
    private static List<Factory<? extends Coffee>> types = Arrays.asList(
            new Latte.Factory(),
            new Mocha.Factory(),
            new Cappuccino.Factory(),
            new Americano.Factory(),
            new Breve.Factory());

    public static Coffee createRandom() {
          int n = rand.nextInt(types.size());
          return types.get(n).create();
    }

} ///:~
