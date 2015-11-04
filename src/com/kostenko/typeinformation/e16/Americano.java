//: generics/coffee/Americano.java
package com.kostenko.typeinformation.e16;

public class Americano extends Coffee {

    public static class Factory implements com.kostenko.typeinformation.e16.Factory<Americano>{
        public Americano create(){
            return new Americano();
        }
    }

} ///:~
