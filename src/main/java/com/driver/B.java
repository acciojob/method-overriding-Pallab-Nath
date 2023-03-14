package com.driver;

public class B extends A {

    String s = super.meth();
    public String meth()
    {
       return "Method is overridden in Extendend class B";
    }
}
