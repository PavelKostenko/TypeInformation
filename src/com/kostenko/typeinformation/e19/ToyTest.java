//: typeinfo/toys/ToyTest.java
// Testing class Class.
package com.kostenko.typeinformation.e19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static net.mindview.util.Print.*;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    public int in=0;
    public Toy() {
    }

    public Toy(int i) {
        in = i;
    }

    public String toString() {
        return "I'm toy. Here I am. My number is " + in;
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {

    FancyToy() {
        super(1);
    }
}

public class ToyTest {

    static void printInfo(Class cc) {
        print("Class name: " + cc.getName()
                + " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) throws InvocationTargetException {
        Class c = null;
        try {
            c = Class.forName("com.kostenko.typeinformation.e19.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());

        System.out.println("**************");

        Constructor[] cnstr = up.getConstructors();
        for (Constructor ct : cnstr) {
            Class<?>[] types = ct.getParameterTypes();
            if (types.length == 1) {
                if (types[0] == int.class) {
                    try {
                        System.out.println(ct.newInstance(new Object[]{(Integer)13}));
                    } catch (InstantiationException ex) {
                        Logger.getLogger(ToyTest.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(ToyTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        System.out.println("***************");
    }
} /* Output:
 Class name: typeinfo.toys.FancyToy is interface? [false]
 Simple name: FancyToy
 Canonical name : typeinfo.toys.FancyToy
 Class name: typeinfo.toys.HasBatteries is interface? [true]
 Simple name: HasBatteries
 Canonical name : typeinfo.toys.HasBatteries
 Class name: typeinfo.toys.Waterproof is interface? [true]
 Simple name: Waterproof
 Canonical name : typeinfo.toys.Waterproof
 Class name: typeinfo.toys.Shoots is interface? [true]
 Simple name: Shoots
 Canonical name : typeinfo.toys.Shoots
 Class name: typeinfo.toys.Toy is interface? [false]
 Simple name: Toy
 Canonical name : typeinfo.toys.Toy
 *///:~
