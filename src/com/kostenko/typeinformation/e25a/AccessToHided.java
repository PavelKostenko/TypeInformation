/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e25a;

/**
 *
 * @author pavel
 */
public class AccessToHided {

    public static A makeHided() {
        return new Hided();
    }
}

class Hided implements A {

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void packageMethod() {
        System.out.println("Package method");
    }
}
