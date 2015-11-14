/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kostenko.typeinformation.e25b;

import com.kostenko.typeinformation.e25a.*;
import java.lang.reflect.Method;

/**
 *
 * @author pavel
 */
public class TestingHided {
    static void callHiddenMethod(Object a, String methodName)throws Exception{
        Method m = a.getClass().getDeclaredMethod(methodName);
        m.setAccessible(true);
        m.invoke(a);
    }
    public static void main(String[] args) throws Exception {
        A a = AccessToHided.makeHided();
        callHiddenMethod(a,"publicMethod");
        callHiddenMethod(a,"privateMethod");
        callHiddenMethod(a,"packageMethod");
        callHiddenMethod(a,"protectedMethod");
    }
}
