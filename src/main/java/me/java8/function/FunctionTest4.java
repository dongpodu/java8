package me.java8.function;

import me.java8.function.domain.Child;
import me.java8.function.domain.ChildImpl;
import me.java8.function.domain.OverridingChild;
import me.java8.function.domain.Parent;

/**
 * java 8 lambada:chapater 4
 * author will
 * 2018/2/5.
 */
public class FunctionTest4 {

    public static void main(String[] args) {
        Parent parent = new ChildImpl();
        parent.welcome();

        Child child = new ChildImpl();
        child.welcome();

        /*
        1、Any class wins over any interface. So if there’s a method with a body, or an abstract declaration, in the superclass chain, we can ignore the interfaces completely.
        2、Subtype wins over supertype. If we have a situation in which two interfaces are competing to provide a default method and one interface extends the other, the subclass wins.
        3、 If the previous two rules don’t give us the answer, the subclass must either implement the method or declare it abstract
         */
        //class wins：不管层级关系如何，继承的方法优先取层级里为class的方法
        Child child1 = new OverridingChild();
        child1.welcome();
    }

}
