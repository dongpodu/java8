package me.java8.function;

import javax.swing.text.DateFormatter;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BinaryOperator;

/**
 * java 8 lambada:chapater 2
 * author will
 * 2018/2/1.
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        //无参数
        Runnable noArguments = () -> System.out.println("a");

        //一个参数
        ActionListener onArgument = event -> System.out.println("b");

        //多行语句
        Runnable mutilStatements = ()->{
            System.out.println("c");
            System.out.println("d");
        };

        //参数无类型
        BinaryOperator<Long> add = (x,y) -> x+y;

        //参数有类型
        BinaryOperator<Long> addExplicit = (Long x,Long y) -> x+y;

        //引用外部的变量，外部变量必须是final or effectively final.
        //lambda引用外部的变量时，引用的是变量的值，而不是变量
        String name = "will";
        Runnable run = () -> {
            //虽然name没加final关键字，但因为只赋值一次，实际上就是final，所以可以再lambda里引用
            System.out.println(name);
        };
        //不能再赋值，因为name在lambda里被引用，故name是final的
        //name = "will";

        //接受lambda的工厂方法
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

        //使用lambda使得dateFormatter变成线程安全的，因为被lambda引入的dateFormatter不可变
        DateFormatter dateFormatter = new DateFormatter();
        MyFunction<Date,String> myFunction = x -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            dateFormatter.setFormat(format);
            return format.format(x);
        };
        System.out.println(myFunction.apply(new Date()));
    }
}
