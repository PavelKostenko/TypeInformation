//: generics/coffee/Breve.java
package com.kostenko.typeinformation.e16;

public class Breve extends Coffee {

public static class Factory implements com.kostenko.typeinformation.e16.Factory<Breve>{
    public Breve create(){
        return new Breve();
    }
}

} ///:~
