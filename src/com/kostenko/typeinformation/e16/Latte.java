//: generics/coffee/Latte.java
package com.kostenko.typeinformation.e16;

public class Latte extends Coffee {

public static class Factory implements com.kostenko.typeinformation.e16.Factory<Latte>{
    public Latte create(){
        return new Latte();
    }
}

} ///:~
