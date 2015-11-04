//: typeinfo/pets/Hamster.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Hamster extends Rodent {
  public Hamster(String name) { super(name); }
  public Hamster() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Hamster>{
      public Hamster create(){
          return new Hamster();
      }
  }
} ///:~
