package me.function;

/**
 * author will
 * 2018/2/1.
 */
@FunctionalInterface
public interface MyFunction<T,R> {
    R apply(T t);
}
