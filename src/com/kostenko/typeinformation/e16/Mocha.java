//: generics/coffee/Mocha.java
package com.kostenko.typeinformation.e16;

public class Mocha extends Coffee {

    public static class Factory implements com.kostenko.typeinformation.e16.Factory<Mocha>{
        public Mocha create(){
            return new Mocha();
        }
    }

} ///:~
