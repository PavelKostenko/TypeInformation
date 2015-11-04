//: typeinfo/pets/Pug.java
package com.kostenko.typeinformation.e15;

import typeinfo.pets.*;

public class Pug extends Dog {
  public Pug(String name) { super(name); }
  public Pug() { super(); }
  public static class Factory implements com.kostenko.typeinformation.e15.Factory<Pug>{
      public Pug create(){
          return new Pug();
      }
  }
} ///:~
