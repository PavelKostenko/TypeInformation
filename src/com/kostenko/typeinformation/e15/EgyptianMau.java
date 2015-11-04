//: typeinfo/pets/EgyptianMau.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class EgyptianMau extends Cat {
  public EgyptianMau(String name) { super(name); }
  public EgyptianMau() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<EgyptianMau>{
      public EgyptianMau create(){
          return new EgyptianMau();
      }
  }
} ///:~
