/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pavel
 */
public class ClassIdentification {
    public static void main(String[] args) {
//        if (args.length!=1){
//            System.out.println("Please provide one argument");
//            System.exit(0);
//        }
        Class c = null;
        try {
            c = Class.forName("java.lang.Class");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassIdentification.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("**********\nAnnotations:");
        for (Annotation a: c.getAnnotations()){
            System.out.println(a);
        }
        
        System.out.println("***********\nCanonicalName:");
        System.out.println(c.getCanonicalName());
        
        System.out.println("***********\nMember class and interfaces:");
        for (Class cl:c.getClasses()){
            System.out.println(cl.getSimpleName());
        }
        
        System.out.println("***********\nConstructors:");
        for (Constructor con: c.getConstructors()){
            System.out.println(con);
        }
        
        System.out.println("**********\nFields:");
        for (Field f: c.getFields()){
            System.out.println(f);
        }
        
        System.out.println("**********\nInterfaces:");
        for (Class cla: c.getInterfaces()){
            System.out.println(cla);
        }
        
        System.out.println("***********\nMethods:");
        for (Method m: c.getMethods()){
            System.out.println(m);
        }
        
        System.out.println("***********\nPackage:");
        System.out.println(c.getPackage());
        
        System.out.println("***********\nSuperclass:");
        System.out.println(c.getSuperclass());
    }
}
