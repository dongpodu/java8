package me.java8.concurrent;

import java.util.concurrent.ForkJoinPool;

/**
 * willdu 2019-07-23
 **/
public class ForkJoinPoolTest {

    public static void test(){
        ForkJoinPool pool = new ForkJoinPool(2);
        System.out.println("执行前size："+pool.getPoolSize());
        pool.execute(() ->{
            try {
                Thread.sleep(10000);
                System.out.println("子任务");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("执行后size："+pool.getPoolSize());
    }

    public static void main(String[] args) {
        test();
    }
}
