//: typeinfo/pets/Rat.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Rat>{
      public Rat create(){
          return new Rat();
      }
  }
} ///:~
