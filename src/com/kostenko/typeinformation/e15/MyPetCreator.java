//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package com.kostenko.typeinformation.e15;
import java.util.*;

public class MyPetCreator extends PetCreator {
  // No try block needed.
  @SuppressWarnings("unchecked")
  public static final List<Factory<? extends Pet>> types =
    Collections.unmodifiableList(Arrays.asList(
            new Dog.Factory(),
            new Cat.Factory(),
            new Mutt.Factory(),
            new Pug.Factory(),
            new EgyptianMau.Factory(),
            new Manx.Factory(),
            new Cymric.Factory(),
            new Rat.Factory(),
            new Mouse.Factory(),
            new Hamster.Factory()));
  // Types for random creation:
  public List<Factory<? extends Pet>> types() {
    return types;
  }	
  public static void main(String[] args) {
    System.out.println(types);
  }
} /* Output:
[class typeinfo.pets.Mutt, class typeinfo.pets.Pug, class typeinfo.pets.EgyptianMau, class typeinfo.pets.Manx, class typeinfo.pets.Cymric, class typeinfo.pets.Rat, class typeinfo.pets.Mouse, class typeinfo.pets.Hamster]
*///:~
