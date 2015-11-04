/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e14;

import typeinfo.factory.*;
import java.util.*;

class Part {

    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Part>> partFactories
            = new ArrayList<Class<? extends Part>>();

    static {
// Collections.addAll() gives an "unchecked generic
// array creation ... for varargs parameter" warning.
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }
    private static Random rand = new Random(47);

    public static Part createRandom() throws InstantiationException, IllegalAccessException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).newInstance();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {}

class AirFilter extends Filter {}

class CabinAirFilter extends Filter {}

class OilFilter extends Filter {}

class Belt extends Part {}

class FanBelt extends Belt {}

class GeneratorBelt extends Belt {}

class PowerSteeringBelt extends Belt {}

public class RegisteredFactories {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < 5; i++) {
            System.out.println(Part.createRandom());
        }
    }
}