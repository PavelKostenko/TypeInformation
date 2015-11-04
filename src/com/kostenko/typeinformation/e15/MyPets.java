//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package com.kostenko.typeinformation.e15;
import typeinfo.pets.*;
import java.util.*;

public class MyPets {
  public static final MyPetCreator creator =
    new MyPetCreator();
  public static Pet randomPet() {
    return creator.randomPet();
  }
  public static Pet[] createArray(int size) {
    return creator.createArray(size);
  }
  public static ArrayList<Pet> arrayList(int size) {
    return creator.arrayList(size);
  }
} ///:~
