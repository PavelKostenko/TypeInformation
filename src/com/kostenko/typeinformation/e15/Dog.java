//: typeinfo/pets/Dog.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Dog extends Pet {
  public Dog(String name) { super(name); }
  public Dog() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Dog>{
      public Dog create(){
          return new Dog();
      }
  }
} ///:~
