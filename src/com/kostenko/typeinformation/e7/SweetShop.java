/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e7;

/**
 *
 * @author pavel
 */
class Candy {

    static {
        System.out.println("Loading Candy");
    }
}

class Gum {

    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {

    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {

    public static void main(String[] args) {
        for (String s: args){
            Class c = null;
            String className = "com.kostenko.typeinformation.e7." + s;
            try{
                c = Class.forName(className);
//                Object obj = c.newInstance();
            } catch (ClassNotFoundException e){
                System.out.println("Can't find " + className);
//            } catch (InstantiationExceptsion e){
//                System.out.println("Can't instantiate");
//            } catch (IllegalAccessException e){
//                System.out.println("Can't access");
            }
        }
    }
}
