package me.java8.function.domain;

/**
 * author will
 * 2018/2/5.
 */
public class OverridingParent implements  Parent{
    @Override
    public void welcome(){
        System.out.println("OverridingParent class");
    }
}
