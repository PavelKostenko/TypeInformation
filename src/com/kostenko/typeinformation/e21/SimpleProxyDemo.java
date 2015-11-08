package com.kostenko.typeinformation.e21;

//: typeinfo/SimpleProxyDemo.java
import typeinfo.*;
import static net.mindview.util.Print.*;

interface Interface {

    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    public void doSomething() {
        print("doSomething");
    }

    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        print("**************\nSimpleProxy doSomething");
        long startTime = System.nanoTime();
        proxied.doSomething();
        long diff = System.nanoTime() - startTime;
        System.out.println("Duration: " + diff + "\n**************");
    }

    public void somethingElse(String arg) {
        print("***************\nSimpleProxy somethingElse " + arg);
        long startTime = System.nanoTime();
        proxied.somethingElse(arg);
        long diff = System.nanoTime() - startTime;
        System.out.println("Duration: " + diff + "\n**************");
    }
}

class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
} /* Output:
 doSomething
 somethingElse bonobo
 SimpleProxy doSomething
 doSomething
 SimpleProxy somethingElse bonobo
 somethingElse bonobo
 *///:~
