package me.java8.function.domain;

/**
 * author will
 * 2018/2/5.
 */
public interface Parent {
    default void welcome(){
        System.out.println("Parent interface");
    }
}
