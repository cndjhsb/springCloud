package com.ljp.servereureka;

/**
 * @author: liujinping
 * @createDate: 2021/8/27
 **/
public class ThreadTest {

   static ThreadLocal<String> local = new ThreadLocal<>();
   static InheritableThreadLocal<String> inlocal = new InheritableThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        inlocal.set("11111");
        Thread t1 = new Thread(() -> {
            System.out.println(local.get());
            inlocal.set("12222");
            System.out.println(inlocal.get());

        });
        Thread t2 = new Thread(() -> {
            local.set("test1-t2");
            local.set("test2-t2");
            System.out.println(local.get());
            local.remove();
        });
        t2.start();
        t1.start();
Thread.sleep(100);
        System.out.println(inlocal.get());

    }
}
