//: typeinfo/pets/Manx.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Manx extends Cat {
  public Manx(String name) { super(name); }
  public Manx() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Manx>{
      public Manx create(){
          return new Manx();
      }
  }
} ///:~
