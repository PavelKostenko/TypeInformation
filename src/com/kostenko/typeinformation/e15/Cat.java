//: typeinfo/pets/Cat.java
package com.kostenko.typeinformation.e15;


public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public static class Factory
            implements com.kostenko.typeinformation.e15.Factory <Cat> {
        public Cat create(){
            return new Cat();
        }
    }
} ///:~
