//: generics/coffee/Cappuccino.java
package com.kostenko.typeinformation.e16;

public class Cappuccino extends Coffee {

public static class Factory implements com.kostenko.typeinformation.e16.Factory<Cappuccino>{
    public Cappuccino create(){
        return new Cappuccino();
    }
}

} ///:~
