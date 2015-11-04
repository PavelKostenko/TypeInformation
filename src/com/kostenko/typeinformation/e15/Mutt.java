//: typeinfo/pets/Mutt.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Mutt extends Dog {
  public Mutt(String name) { super(name); }
  public Mutt() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Mutt>{
      public Mutt create(){
          return new Mutt();
      }
  }
} ///:~
