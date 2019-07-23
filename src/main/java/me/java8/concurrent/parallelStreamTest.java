package me.java8.concurrent;

import java.util.stream.IntStream;

/**
 * willdu 2019-07-22
 **/
public class parallelStreamTest {

    public static void test1(){
        //parallel开启多线程，子线程的任务完成后才执行后续操作
        IntStream.range(0,1000).parallel().forEach(r ->{
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        test1();
    }
}
