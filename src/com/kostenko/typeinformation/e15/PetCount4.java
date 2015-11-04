package com.kostenko.typeinformation.e15;

//: typeinfo/PetCount4.java
import typeinfo.pets.*;

public class PetCount4 {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Pet.class);
    for(Pet pet : MyPets.createArray(20)) {
        System.out.println(pet.getClass().getSimpleName() + " ");
      counter.count(pet);
    }
    System.out.println("");
      System.out.println(counter);
  }
} /* Output: (Sample)
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
{Mouse=2, Dog=6, Manx=7, EgyptianMau=2, Rodent=5, Pug=3, Mutt=3, Cymric=5, Cat=9, Hamster=1, Pet=20, Rat=2}
*///:~
