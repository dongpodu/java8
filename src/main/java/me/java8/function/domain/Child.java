package me.java8.function.domain;

/**
 * @author will
 * 2018/2/5.
 */
public interface Child extends Parent{
    @Override
    default void welcome(){
        System.out.println("Child interface");
    }
}
