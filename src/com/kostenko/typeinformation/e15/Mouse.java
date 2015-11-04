//: typeinfo/pets/Mouse.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Mouse extends Rodent {
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Mouse>{
      public Mouse create(){
          return new Mouse();
      }
  }
} ///:~
