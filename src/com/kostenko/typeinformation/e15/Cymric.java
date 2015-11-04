//: typeinfo/pets/Cymric.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Cymric extends Manx {
  public Cymric(String name) { super(name); }
  public Cymric() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Cymric>{
      public Cymric create(){
          return new Cymric();
      }
  }
} ///:~
